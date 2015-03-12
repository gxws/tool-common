package com.gxws.tool.common.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目信息，属性值
 * 
 * @author 朱伟亮
 * @create 2015年2月27日下午5:33:56
 *
 */
public class ProjectConstant {

	public static String VALUE_PROJECT_NAME = "";// 项目名

	public static String VALUE_PROJECT_ENV = "";// 项目环境

	public static String VALUE_PROJECT_VERSION = "";// 项目版本

	public static String VALUE_PROJECT_IP = "";// 项目运行网卡IP地址

	public static String VALUE_PROJECT_PORT = "";// 项目运行实例端口号

	public static final String NAME_PROJECT_NAME = "project.name";

	public static final String NAME_PROJECT_ENV = "project.env";

	public static final String NAME_PROJECT_VERSION = "project.version";

	public static final String NAME_PROJECT_IP = "project.ip";

	public static final String NAME_PROJECT_PORT = "project.port";

	public static Map<String, String> map = new HashMap<>();

	public static void put(String key, String value) {
		map.put(key, value);
	}

	public static String get(String key) {
		return map.get(key);
	}

	public static void putAll(Map<String, String> m) {
		map.putAll(m);
	}

	public static Map<String, String> getAll() {
		return map;
	}

}
