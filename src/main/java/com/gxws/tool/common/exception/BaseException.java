package com.gxws.tool.common.exception;

/**
 * 异常
 * 
 * @author zhuwl120820@gxwsxx.com
 * @since 1.2
 */
public class BaseException extends Exception {
	private String id = "";
	private String code = "";
	private String value = "";
	private String name = "";
	private String type = "";
	private String msg = "";
	private String reason = "";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
