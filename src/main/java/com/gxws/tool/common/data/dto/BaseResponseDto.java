package com.gxws.tool.common.data.dto;

import java.io.Serializable;

/**
 * 服务提供方应答的基础数据
 * 
 * @author 朱伟亮
 * @create 2015年3月6日下午1:35:38
 *
 */
public class BaseResponseDto implements Serializable {

	private static final long serialVersionUID = 8100651540477131561L;
	private String serviceRequest;

	public String getServiceRequest() {
		return serviceRequest;
	}

	public void setServiceRequest(String serviceRequest) {
		this.serviceRequest = serviceRequest;
	}

}