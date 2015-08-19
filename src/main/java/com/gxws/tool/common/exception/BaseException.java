package com.gxws.tool.common.exception;

/**
 * 异常
 * 
 * @author zhuwl120820@gxwsxx.com
 * @since 1.2
 */
public class BaseException extends Exception {
	private static final long serialVersionUID = 4399238246364390381L;
	private String id = "";
	private String code = "";
	private String value = "";
	private String name = "";
	private String type = "";
	private String msg = "";
	private String reason = "";

	/**
	 * 覆盖Exception中的getMessage方法，返回或获取异常对象的提示信息
	 * 
	 * @see java.lang.Throwable#getMessage()
	 * @since 1.3
	 */
	@Override
	public String getMessage() {
		return this.getMsg();
	}

	/**
	 * 添加需要调试的异常提示信息
	 * 
	 * @author zhuwl120820@gxwsxx.com
	 * @param msg
	 *            提示信息
	 * @since 1.3
	 */
	public void appendMsg(String msg) {
		this.setMsg(this.getMsg() + "。" + msg);
	}

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
