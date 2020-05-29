package util;

import vo.User;

//全局信息
public class Global {
	public static String classPath; // 存放各种文件目录的绝对地址，文件存放于当前目录下的data子目录中
	public static User currentUser; // 当前登录用户信息

	// 各种文件的文件名常量定义
	public static final String MYBATIS_CONFIG_FILENAME = "mybatis-config.xml";
	public static final String PRODUCT_TXT = "product.txt";
	public static final String PRODUCT_XLS = "product.xls";


}
