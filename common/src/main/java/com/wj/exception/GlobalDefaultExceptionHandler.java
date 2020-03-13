/**
 *
 */
package com.wj.exception;

import com.wj.consants.ResultConstants;
import com.wj.util.JSONUtil;
import com.wj.util.LogUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

/**
 * 全局异常处理
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler
{

    protected static final Logger logger = LoggerFactory.getLogger(GlobalDefaultExceptionHandler.class);

    private static Properties prop = JSONUtil.getProp();

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String defaultErrorHandler(Exception e)
    {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw, true));
        String message = e.getMessage();
        LogUtil.logger(message, LogUtil.ERROR_LEVEL, e);
        if (e instanceof ServiceException)
        {
            return initServiceMessage(message);
        }
        return initMessage(message);
    }

    private String initMessage(String exCode)
    {
        String msg = prop.getProperty(exCode);
        if (StringUtils.isBlank(msg))
        {
            return JSONUtil.error(String.valueOf(ResultConstants.RESULT_CODE_FAIL));
        }
        return JSONUtil.error(exCode);
    }

    /**
     * 自定义serviceException处理
     */
    private String initServiceMessage(String exCode)
    {
        String msg = prop.getProperty(exCode);
        if (StringUtils.isBlank(msg) && StringUtils.isBlank(exCode))
        {
            return JSONUtil.error(String.valueOf(ResultConstants.RESULT_CODE_FAIL));
        }
        return JSONUtil.error(exCode);
    }

}
