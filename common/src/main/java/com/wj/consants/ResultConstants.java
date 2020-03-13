/*
* Project Name:zhzf
* File Name:ResultConstants.java
* Package Name:com.iflytek.zhzf.common.constant
* Date:2018/6/28 11:02
* Copyright (c) 2017, chaowang9 All Rights Reserved.
*
*/
package com.wj.consants;

/**
 * ClassName: ResultConstants
 * Function: 返回结果常量定义.
 * Date: 2018/6/28 11:02
 * @author chaowang9
 * @version 1.0
 */
public class ResultConstants
{
    /**
     * 业务结果码:调用成功
     */
    public static final int RESULT_CODE_SUCCESS = 0;

    /**
     * 错误请求异常
     */
    public static final int RESULT_CODE_BAD_REQUEST = 400;

    /**
     * 系统出错
     */
    public static final int RESULT_CODE_FAIL = 500;

    /**
     * 传入参数为空
     */
    public static final int RESULT_CODE_PARAM_NULL = 1001;

    /**
     * 传入参数错误
     */
    public static final int RESULT_CODE_PARAM_INVALID = 1002;

    /**
     * 传入json错误
     */
    public static final int RESULT_CODE_JSON_INVALID = 1003;

    /**
     * 附件格式不正确
     */
    public static final int RESULT_CODE_ATTACHMENT_TYPE_INVALID = 1004;

    /**
     * 附件大小不正确
     */
    public static final int RESULT_CODE_ATTACHMENT_SIZE_INVALID = 1005;

    /**
     * 附件数量不正确
     */
    public static final int RESULT_CODE_ATTACHMENT_NUMBER_INVALID = 1006;

    /**
     * 登录失败
     */
    public static final int RESULT_CODE_LOGIN_FAILED = 2001;

    /**
     * 用户不存在
     */
    public static final int RESULT_CODE_USER_NOT_EXITS = 2002;

    /**
     * 密码错误
     */
    public static final int RESULT_CODE_USER_PASSWORD_INVALID = 2003;

    /**
     * 用户接口获取失败
     */
    public static final int RESULT_CODE_USER_INTERFACE_INVALID = 2004;

    /**
     * 用户token接口获取失败
     */
    public static final int RESULT_CODE_TOKEN_INTERFACE_INVALID = 2005;

    /**
     * 电话号码已经存在
     */
    public static final int RESULT_CODE_PHONE_EXITS = 2006;

    /**
     * 用户退出失败
     */
    public static final int RESULT_CODE_LOGOUT_FAILED = 2007;

    /**
     * 账号已经存在
     */
    public static final int RESULT_CODE_ACCOUNT_EXITS = 2008;

    /**
     * 获取空气质量接口失败
     */
    public static final int RESULT_CODE_AIR_QUALITY_FAILED = 2009;

    /**
     * 无访问权限
     */
    public static final int RESULT_CODE_NO_AUTH = 2010;

    /**
     * 验证码，手机，序号不一致
     */
    public static final int RESULT_CODE_IDENTIFYING_INVALID = 2009;

    /**
     * 附件上传失败
     */
    public static final int RESULT_CODE_ATTACHMENT_UPLOAD_FAILED = 3001;

    /**
     * 释放资源失败
     */
    public static final int RESULT_CODE__RELEASE_RESOURCE = 3002;

    /**
     * 非法操作，如用户没操作自己的数据的情况
     */
    public static final int RESULT_CODE_ILLEGAL_OPERATE = 3010;

    /**
     * excel导入失败
     */
    public static final int RESULT_CODE_EXCEL_IMPORT_FAILED = 4001;

    /**
     * excel模板错误
     */
    public static final int RESULT_CODE_EXCEL_TEMPLATE_ERROR = 4002;

    /**
     * 导入文件中没有数据
     */
    public static final int RESULT_CODE_EXCEL_NO_DATA = 4003;

    /**
     * 工作表数量不正确
     */
    public static final int RESULT_CODE_EXCEL_SHEET_NUM_ERROR = 4004;

    /**
     * 导入配置错误
     */
    public static final int RESULT_CODE_EXCEL_CONFIG_ERROR = 4005;

    /**
     * 导入文件关闭失败
     */
    public static final int RESULT_CODE_EXCEL_CLOSE_FAILED = 4006;

    /**
     * 导入文件读取失败
     */
    public static final int RESULT_CODE_EXCEL_READ_FAILED = 4007;

    /**
     * 保存失败
     */
    public static final int RESULT_CODE_SAVE_FAILED = 4008;

    /**
     * 更新失败
     */
    public static final int RESULT_CODE_EDIT_FAILED = 4009;

    /**
     * 编辑头像失败
     */
    public static final int RESULT_CODE_EDIT_HEAD_IMG_FAILED = 4010;

    /**
     * 计划名称不能重复
     */
    public static final int RESULT_CODE_PLAN_NAME_EXIST = 4011;

    /**
     * 更新系统缓存成功
     */
    public static final int RESULT_CODE_UPDATE_CACHE_SUCCESS = 4012;

    /**
     * token过期
     */
    public static final int RESULT_CODE_EXPIRE_TOKEN = 40003;

    /**
     * 原密码错误
     */
    public static final int RESULT_CODE_OLD_PASS_ERROR = 40021;

    /**
     * 事件对应的处置已经存在
     */
    public static final int RESULT_CODE_AFFAIR_EXIST = 4013;

    /**
     * 该任务已经处理
     */
    public static final int RESULT_CODE_HANDLE_COMPLETE = 4015;

    /**
     * 天气数据加载失败
     */
    public static final int RESULT_CODE_WEATHER_LOAD_ERROR = 4016;

    /**
     * 用户过期，请重新登录
     */
    public static final int RESULT_CODE_CACHE_EXPIRATION = 4017;

    /**
     * 执行周期，执行频率或执行时间不合法
     */
    public static final int RESULT_CODE_EXECUTE_DATE_ERROR = 4018;

    /**
     * json文件加载失败
     */
    public static final int RESULT_CODE_JSON_LOAD_ERROR = 4019;

    /**
     * 导出word失败
     */
    public static final int RESULT_EXPORT_WORD_FAIL = 4020;

    /**
     * 对象不存在
     */
    public static final int RESULT_AFFAIR_NOT_EXIST = 4021;

    /**
     * 同步用户信息失败
     */
    public static final int RESULT_SYN_USER_ERROR = 4022;

    /**
     * 获取文书信息失败
     */
    public static final int RESULT_ENFORCE_DOC_ERROR = 4023;

    /**
     * 立案审批撤回失败
     */
    public static final int RESULT_ENFORCE_BACK_ERROR = 4024;

    /**
     * 改任务已被处置
     */
    public static final int RESULT_ENFORCE_DISPATCH_ERROR = 4025;

    /**
     * 已提交立案申请
     */
    public static final int RESULT_ENFORCE_CASE_ERROR = 4026;

    /**
     * 退回失败，找不到上次操作节点
     */
    public static final int RESULT_RETURN_ERROR = 4027;

    /**
     * 核查任务已经完成
     */
    public static final int RESULT_CHECKED_ERROR = 4028;

    /**
     * 该用户对应菜单已保存
     */
    public static final int RESULT_RESUBMIT_ERROR = 4029;

    /**
     * 该法律法规已关联行为处罚，无法删除
     */
    public static final int RESULT_ENFORCE_LIB_ERROR = 4030;

    /**
     * 当事人已经存在
     */
    public static final int RESULT_ENFORCE_CURRENT_EXISTS = 4031;

    /**
     * 任务不存在
     */
    public static final int RESULT_TASK_NOT_EXISTS = 4032;

    /**
     * 事件已被受理
     */
    public static final int RESULT_AFFAIR_ALREADY_ACCEPTED = 4033;

    /**
     * 事件流程错误
     */
    public static final int RESULT_AFFAIR_FLOW_ERROR=4034;

    /**
     * 已进入下一步流程了，无法撤回
     */
    public static final int RESULT_AFFAIR_FLOW_IN_NEXT = 4035;

    /**
     * 对象不存在
     */
    public static final int RESULT_OBJECT_NOT_EXIST = 4036;

    /**
     * 处罚申请已经存在
     */
    public static final int RESULT_APPLAY_EXIST = 4037;

    /**
     * 案件已被审批
     */
    public static final int AFFAIR_APPROVE_EXIST = 4038;

    /**
     * 案件已被他人受理
     */
    public static final int CASE_ACCEPTED = 4039;

    /**
     * 已在其他地方登录，请重新登录
     */
    public static final int RESULT_CODE_CACHE_OUT = 4040;

    /**
     * 人脸注册失败，请确认信息后再试
     */
    public static final int RESULT_CODE_FACE_REG_ERROR = 4041;

    /**
     * 人脸验证失败，请确认信息后再试
     */
    public static final int RESULT_CODE_FACE_VERIFY_ERROR = 4042;

    /**
     * 声纹注册失败，请确认信息后再试
     */
    public static final int RESULT_CODE_SPEECH_REG_ERROR = 4043;

    /**
     * 声纹验证失败，请确认信息后再试
     */
    public static final int RESULT_CODE_SPEECH_VERIFY_ERROR = 4044;

    /**
     * 整改任务已经完成
     */
    public static final int RESULT_ZG_TASK_FINISHED_ERROR = 4045;

    /**
     * 账号已被冻结，请联系管理员
     */
    public static final int PASSWORD_ERROR = 4046;

    /**
     * 加载校验流程资源json文件失败
     */
    public static final int INIT_CHECK_PROCESS_FILE_ERROR = 4047;

    /**
     * 校验流程资源url时未获取到事件id
     */
    public static final int CAN_NOT_GET_AFFAIRID_ERROR = 4048;

    /**
     * 未获取到用户的角色信息
     */
    public static final int CAN_NOT_GET_USER_ROLEINFO_ERROR = 4049;

    /**
     * 调用远程服务失败
     */
    public static final int RESULT_CODE_REMOTE_SERVER_FAIL = 4050;

    /**
     * 账号或密码错误
     */
    public static final int RESULT_ACCOUNT_PASSWORD_ERROR = 4051;

    /**
     * 上传附件错误
     */
    public static final int RESULT_UPLOAD_FILE_ERROR = 4052;

    /**
     * 无效的附件类型
     */
    public static final int INVALID_ATTACHMENT_TYPE_ERROR = 4053;

    /**
     * 图片压缩失败
     */
    public static final int IMAGE_COMPRESS_ERROR = 4054;

    /**
     * 调用普元工作流失败
     */
    public static final int PY_ALLOT_ERROR = 4055;

    /**
     * 验证码不存在
     **/
    public static final int VERIFICATION_CODE_EXIST = 4059;

    /**
     * 短信发送失败
     **/
    public static final int MSG_SEND_FAIL = 4060;

    /**
     * 该流程已被处理，请刷新重试
     */
    public static final int FLOW_IS_HANDLE = 5000;

    /**
     * 没有项目访问权限
     */
    public static final int NOT_PROJECT__AUTH = 5001;


    /**
     * 模板不存在
     */
    public static final int NOT_EXISTS__TEMPLATE = 5002;

    /**
     * 素材库容量设置大小不能小于当前已使用容量
     */
    public static final int SIZE_MAX_BIGGER = 2011;

    /**
     * excel导入失败
     */
    public static final int EXCEL_IMPORT_FAIL = 4061;

    /**
     * 计划明细不能为空
     */
    public static final int PLAN_DETAIL_NULL_ERROR = 5003;

    /**
     * excel模板为空
     */
    public static final int EXCEL_DATA_EMPTY = 5004;

    /**
     * 文件数据为空
     */
    public static final int EXCEL_EMPTY = 5005;

    /**
     * 软件名称已存在
     */
    public static final int SOFTWARE_NAME_EXIST = 5006;


    /**
     * 软件计划不能为空
     */
    public static final int SOFTWARE_PLAN_EMPTY = 5007;

    /**
     * 供应商不存在
     */
    public static final int GYS_NOT_EXIST= 5008;

    /**
     * 产品单位不存在
     */
    public static final int DW_NOT_EXIST= 5009;

    /**
     * 产品分类不存在
     */
    public static final int CATELOG_NOT_EXIST= 5010;

    /**
     * 产品已经存在
     */
    public static final int PRODUCT_EXIST= 5011;

}
