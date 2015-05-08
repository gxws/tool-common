package com.gxws.tool.common.constant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 项目信息，属性值
 * 
 * @author zhuwl120820@gxwsxx.com 2015年2月27日下午5:33:56
 *
 */
public class ProjectConstant {

	/**
	 * 线上环境定义。env的值等于set内的其中一项时，将启用以下功能：<br>
	 * 远程配置读取功能，项目tool-link-properties。<br>
	 * 远程日志存储功能，项目tool-logging。<br>
	 */
	public final static Set<String> onlineEnvSet = new HashSet<String>(
			Arrays.asList(new String[] { "dev", "test", "real" }));

	private String name;

	private String env = "env_default";

	private String version;

	private String ip;

	private String port = "port_default";

	// public static String VALUE_PROJECT_NAME = "";// 项目名
	//
	// public static String VALUE_PROJECT_ENV = "";// 项目环境
	//
	// public static String VALUE_PROJECT_VERSION = "";// 项目版本
	//
	// public static String VALUE_PROJECT_IP = "";// 项目运行网卡IP地址
	//
	// public static String VALUE_PROJECT_PORT = "";// 项目运行实例端口号

	public static final String NAME_PROJECT_NAME = "project.name";

	public static final String NAME_PROJECT_ENV = "project.env";

	public static final String NAME_PROJECT_VERSION = "project.version";

	public static final String NAME_PROJECT_IP = "project.ip";

	public static final String NAME_PROJECT_PORT = "project.port";

	private Map<String, String> map = new HashMap<>();

	private static ProjectConstant self;

	private ProjectConstant() {

	}

	public static ProjectConstant instance() {
		if (null == self) {
			self = new ProjectConstant();
		}
		return self;
	}

	public static void put(String key, String value) {
		self.map.put(key, value);
	}

	public static String get(String key) {
		return self.map.get(key);
	}

	// public void putAll(Map<String, String> m) {
	// map.putAll(m);
	// }

	public Map<String, String> getAll() {
		return map;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		map.put(NAME_PROJECT_NAME, this.name);
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		if (null != env && !"".equals(env)) {
			this.env = env;
		}
		map.put(NAME_PROJECT_ENV, this.env);
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
		map.put(NAME_PROJECT_VERSION, this.version);
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		map.put(NAME_PROJECT_IP, this.ip);
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		if (null != port && !"".equals(port)) {
			this.port = port;
		}
		map.put(NAME_PROJECT_PORT, this.port);
	}

}
