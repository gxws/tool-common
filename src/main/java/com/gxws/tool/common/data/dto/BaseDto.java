package com.gxws.tool.common.data.dto;

import java.io.Serializable;
import java.util.Map;

/**
 * base data transfer object 基础数据传输对象
 * 
 * 用于远程调用数据传输对象都需要继承该类
 * 
 * @author 朱伟亮
 * @create 2015年3月6日上午11:30:37
 *
 */
public class BaseDto implements Serializable {

	private static final long serialVersionUID = 7414747570827931208L;

	private Map<String, String> requestMap;

	private Map<String, String> responseMap;

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

}
