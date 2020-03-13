
 /**
 * Project Name:framework
 * File Name:ServiceException.java
 * Package Name:com.iflytek.framework.exception
 * Date:2017-6-26下午3:33:42
 * Copyright (c) 2017, hanxu All Rights Reserved.
 *
*/

package com.wj.exception;

 /**
 * @Description //业务异常
 * @Date 2019/12/28 15:09:29
 *
 * @return
 * @Author aoliu2
 **/
public class ServiceException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ServiceException(String msg){
		super(msg);
	}

	public ServiceException(int exCode){

		super(String.valueOf(exCode));
	}

	public ServiceException(String message, Throwable root) {
		super( message, root );
	}

}

