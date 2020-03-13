/**
 * <br>
 * Copyright 2011 IFlyTek. All rights reserved.<br>
 * <br>
 * Package: com.iflytek.cbs.base <br>
 * FileName: JSONUtil.java <br>
 * <br>
 * @version
 * @author zhuxianming
 * @created 2015年11月18日
 * @last Modified
 * @history
 */

package com.wj.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.wj.consants.ResultConstants;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.*;

/**
 * 处理返回JSON格式数据
 *
 * @author zhuxianming
 * @lastModified
 * @history
 */

public class JSONUtil
{
    /**
     * log4j
     */
    protected static final Logger logger = LoggerFactory.getLogger(JSONUtil.class);

    private static Properties prop = new Properties();
    static
    {
        try
        {
            prop = PropertiesLoaderUtils.loadAllProperties("messages.properties");
        }
        catch (IOException e)
        {
            logger.error("messages.properties ...加载失败");
        }
    }

    private static ValueFilter filter = new ValueFilter()
    {
        @Override
        public Object process(Object obj, String s, Object v)
        {
            if (v == null)
                return "";
            return v;
        }
    };

    public static String resultList(boolean b, List<?> list, String msg)
    {
        if (list == null)
        {
            return error();
        }
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", list);
        result.put("total", list.size());
        return result(b, result, msg);
    }

    /**
     * 处理返回值
     *
     * @param b 操作是否成功
     * @param data 操作返回的 主体数据 data
     * @param msg 操作返回的信息描述
     * @return JSON { "status":true, //状态 true成功，false 失败 "data":OBJECT //主体数据, 如果没有返回Null "msg":"操作成功" //
     *         返回操作描述，可以是前后台标准接口编码 }
     * @author zhuxianming
     * @created 2015年11月18日 上午9:17:46
     * @lastModified
     * @history
     */
    public static String result(boolean b, Object data, String msg)
    {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", b);
        map.put("data", data);
        map.put("msg", msg);
        // return JSONObject.fromObject(map).toString();
        return JSON.toJSONString(map, filter);
    }

    /**
     * 处理返回值
     *
     * @param code 响应代码代码
     * @param b 操作是否成功
     * @param data 操作返回的 主体数据 data
     * @param msg 操作返回的信息描述
     * @return JSON { "status":true, //状态 true成功，false 失败 "data":OBJECT //主体数据, 如果没有返回Null "msg":"操作成功" //
     *         返回操作描述，可以是前后台标准接口编码 }
     * @author zhuxianming
     * @created 2015年11月18日 上午9:17:46
     * @lastModified
     * @history
     */
    public static String result(boolean b, String code, Object data, String msg)
    {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", b);
        map.put("code", code);
        map.put("data", data);
        map.put("msg", msg);
        // return JSONObject.fromObject(map).toString();
        return JSON.toJSONString(map, filter);
    }

    public static String success(List<?> list)
    {
        return resultList(true, list, "");
    }

    /**
     * 便捷方法，快速返回成功信息
     *
     * @param data
     * @return
     * @author zhuxianming
     * @created 2015年11月18日 上午9:56:30
     * @lastModified
     * @history
     */
    public static String success(Object data)
    {
        return result(true, String.valueOf(ResultConstants.RESULT_CODE_SUCCESS), data, "");
    }

    /**
     *
     * 无返回值的成功操作
     *
     * @return
     * @author zhuxianming
     * @created 2015年11月18日 上午10:25:41
     * @lastModified
     * @history
     */
    public static String success()
    {
        return success("");
    }

    /**
     * 错误返回接口
     *
     * @author zhuxianming
     * @created 2015年11月18日 下午3:57:20
     * @lastModified
     * @history
     */
    public static String error()
    {
        return result(false, null, "");
    }

    /**
     * 错误返回接口
     *
     * @author zhuxianming
     * @created 2015年11月18日 下午3:57:20
     * @lastModified
     * @history
     */
    public static String error(String code)
    {
        if (StringUtils.isNotBlank(getMessage(String.valueOf(code))))
        {
            return result(false, code, null, getMessage(String.valueOf(code)));
        }
        else
        {
            return result(false, null, null, code);
        }

    }

    /**
     * 错误返回接口
     *
     * @author zhuxianming
     * @created 2015年11月18日 下午3:57:20
     * @lastModified
     * @history
     */
    public static String error(String code, String data)
    {
        return result(false, code, data, getMessage(String.valueOf(code)));
    }

    /**
     * @Description 从内存中获取配置的提示信息
     * @Date 2019/12/06 16:28:35
     * @param messageId
     * @param args
     * @return java.lang.String
     * @Author aoliu2
     **/
    private static String getMessage(String messageId, Object... args)
    {

        String message = prop.getProperty(messageId);
        if (StringUtils.isBlank(message))
        {
            return "";
        }
        else
        {
            try
            {
                return String.format(message, args);
            }
            catch (IllegalFormatException var5)
            {
                logger.debug("参数错误：message=[" + message + "],参数个数=[" + args.length + "]", new Object[0]);
                return "";
            }
        }
    }

    /**
     * filterField:(过滤属性). <br/>
     *
     * @param fieldName 不序列号的字段名称
     * @return PropertyFilter
     */
    public static PropertyFilter filterField(final String fieldName)
    {
        return new PropertyFilter()
        {

            @Override
            public boolean apply(Object obj, String name, Object value)
            {
                if (StringUtils.endsWithIgnoreCase(name, fieldName))
                {
                    return false;
                }
                return true;
            }
        };
    }

    /**
     * 将Map转换为对象
     *
     * @param paramMap
     * @param cls
     * @return
     */
    public static <T> T parseMap2Object(Map<String, Object> paramMap, Class<T> cls)
    {
        return JSONObject.parseObject(JSONObject.toJSONString(paramMap), cls);
    }

    /**
     * 将对象转换为Map
     *
     * @param obj
     * @return
     */
    public static Map parseObj2Map(Object obj)
    {
        return JSONObject.parseObject(JSONObject.toJSONString(obj), Map.class);
    }

    /**
     * @Description // 对象转json 字符串（没有值的的也保留）
     * @Date 2019/05/08 16:33:55
     * @param obj
     * @return java.lang.String
     * @Author aoliu2
     **/
    public static String toJSONString(Object obj)
    {
        return JSON.toJSONString(obj, filter);
    }

    /**
     * @Description 复制对象
     * @Date 2019/07/19 16:51:54
     * @param obj
     * @param cls
     * @return T
     * @Author aoliu2
     **/
    public static <T> T copyObj(Object obj, Class<T> cls)
    {
        return JSONObject.parseObject(JSONObject.toJSONString(obj), cls);
    }

    public static Properties getProp()
    {
        return prop;
    }
}
