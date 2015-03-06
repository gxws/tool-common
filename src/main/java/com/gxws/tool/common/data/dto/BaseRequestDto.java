package com.gxws.tool.common.data.dto;

import java.io.Serializable;

/**
 * 服务调用方请求的基础数据
 * 
 * @author 朱伟亮
 * @create 2015年3月6日下午1:35:21
 *
 */
public class BaseRequestDto implements Serializable {

	private static final long serialVersionUID = -1952239903303281777L;
	private String httpRequestId;
	private String httpSessionId;

	public String getHttpRequestId() {
		return httpRequestId;
	}

	public void setHttpRequestId(String httpRequestId) {
		this.httpRequestId = httpRequestId;
	}

	public String getHttpSessionId() {
		return httpSessionId;
	}

	public void setHttpSessionId(String httpSessionId) {
		this.httpSessionId = httpSessionId;
	}

}
