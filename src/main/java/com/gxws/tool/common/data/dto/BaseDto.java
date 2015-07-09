package com.gxws.tool.common.data.dto;

import java.io.Serializable;
import java.util.Map;

import com.gxws.tool.common.exception.BaseException;

/**
 * base data transfer object 基础数据传输对象
 * 
 * 用于远程调用数据传输对象都需要继承该类
 * 
 * @author zhuwl120820@gxwsxx.com 2015年3月6日上午11:30:37
 *
 */
public class BaseDto implements Serializable {

	private static final long serialVersionUID = 7414747570827931208L;

	// 提供日志信息
	private Map<String, String> requestMap;

	// 提供日志信息
	private Map<String, String> responseMap;

	// 远程调用是否异常
	private boolean hasException = false;

	// 异常对象
	private BaseException exception;

	public Map<String, String> getRequestMap() {
		return requestMap;
	}

	public void setRequestMap(Map<String, String> requestMap) {
		this.requestMap = requestMap;
	}

	public Map<String, String> getResponseMap() {
		return responseMap;
	}

	public void setResponseMap(Map<String, String> responseMap) {
		this.responseMap = responseMap;
	}

	public boolean hasException() {
		return hasException;
	}

	public BaseException getException() {
		return exception;
	}

	public void setException(BaseException exception) {
		this.hasException = true;
		this.exception = exception;
	}

}
