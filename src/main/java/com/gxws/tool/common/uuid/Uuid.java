package com.gxws.tool.common.uuid;

import java.net.InetAddress;
import java.util.UUID;

/**
 * 生成uuid的类
 * 
 * @author zhuwl120820@gxwsxx.com 2015年2月27日下午3:08:32
 *
 */
public class Uuid {

	/**
	 * 随机uuid
	 * 
	 * @author zhuwl120820@gxwsxx.com 2015年2月27日下午3:30:46
	 * 
	 * @return 32位uuid
	 */
	public static String random() {
		return randomSplit("");
	}

	/**
	 * 顺序uuid
	 * 
	 * @author zhuwl120820@gxwsxx.com 2015年2月27日下午3:31:35
	 * 
	 * @return 32位uuid
	 */
	public static String order() {
		return orderSplit("");
	}

	/**
	 * 随机uuid带分隔符
	 * 
	 * @author zhuwl120820@gxwsxx.com 2015年2月27日下午3:31:48
	 * 
	 * @param character
	 *            分隔符
	 * @return 36位带分隔符的uuid
	 */
	public static String randomSplit(String character) {
		String value = UUID.randomUUID().toString();
		StringBuffer sb = new StringBuffer(value.substring(0, 8))
				.append(character).append(value.substring(9, 13))
				.append(character).append(value.substring(14, 18))
				.append(character).append(value.substring(19, 23))
				.append(character).append(value.substring(24));
		value = sb.toString();
		return value;
	}

	/**
	 * 顺序uuid带分隔符
	 * 
	 * @author zhuwl120820@gxwsxx.com 2015年2月27日下午3:31:57
	 * 
	 * @param character
	 *            分隔符
	 * @return 36位带分隔符的uuid
	 */
	public static String orderSplit(String character) {
		String value = new StringBuffer(36).append(format(getIP()))
				.append(character).append(format(getJVM())).append(character)
				.append(format(getHiTime())).append(character)
				.append(format(getLoTime())).append(character)
				.append(format(getCount())).toString();
		return value;
	}

	private static final int IP;

	private static int IptoInt(byte[] bytes) {
		int result = 0;
		for (int i = 0; i < 4; i++) {
			result = (result << 8) - Byte.MIN_VALUE + (int) bytes[i];
		}
		return result;
	}

	static {
		int ipadd;
		try {
			ipadd = IptoInt(InetAddress.getLocalHost().getAddress());
		} catch (Exception e) {
			ipadd = 0;
		}
		IP = ipadd;
	}
	private static short counter = (short) 0;
	private static final int JVM = (int) (System.currentTimeMillis() >>> 8);

	protected static int getJVM() {
		return JVM;
	}

	protected static short getCount() {
		if (counter < 0) {
			counter = 0;
		}
		return counter++;
	}

	protected static int getIP() {
		return IP;
	}

	protected static short getHiTime() {
		return (short) (System.currentTimeMillis() >>> 32);
	}

	protected static int getLoTime() {
		return (int) System.currentTimeMillis();
	}

	protected static String format(int intval) {
		String formatted = Integer.toHexString(intval);
		StringBuffer buf = new StringBuffer("00000000");
		buf.replace(8 - formatted.length(), 8, formatted);
		return buf.toString();
	}

	protected static String format(short shortval) {
		String formatted = Integer.toHexString(shortval);
		StringBuffer buf = new StringBuffer("0000");
		buf.replace(4 - formatted.length(), 4, formatted);
		return buf.toString();
	}

}
