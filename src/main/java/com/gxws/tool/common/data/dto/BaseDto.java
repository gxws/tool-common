package com.gxws.tool.common.data.dto;

import java.io.Serializable;

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

	private BaseRequestDto baseRequestDto;

	private BaseResponseDto baseResponseDto;

	public BaseRequestDto getBaseRequestDto() {
		return baseRequestDto;
	}

	public void setBaseRequestDto(BaseRequestDto baseRequestDto) {
		this.baseRequestDto = baseRequestDto;
	}

	public BaseResponseDto getBaseResponseDto() {
		return baseResponseDto;
	}

	public void setBaseResponseDto(BaseResponseDto baseResponseDto) {
		this.baseResponseDto = baseResponseDto;
	}

}
