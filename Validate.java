package util;
/**
 * 利用正则表达式封装各类数据输入的格式校验
 */
public class Validate {
	//商品条形码只能是6位数字
	public static boolean validateBarcode(String barcode) {
		return barcode.matches("\\d{6}");
	}
	
	//yyyy-MM-dd形式的日期格式
	public static boolean  validateDate(String date) {
		return date.matches("\\d{4}-[01]\\d{1}-[0123]\\d{1}");
	}
	
	/**
	 * 密码复杂性校验
	 * 1.不能全数字 (?![0-9]+$)
	 * 2.不全全字母 (?![a-zA-Z]+$)
	 * 3.不能全数字或小写 (?![0-9a-z]+$)
	 * 4.不能全数字或小写 (?![0-9A-Z]+$)
	 * 5.数字或字母，至少6位([0-9a-zA-Z]{6,})
	 * 
	 */
	public static boolean validatePassword(String password) {
		return password.matches("(?![0-9]+$)(?![a-zA-Z]+$)(?![0-9a-z]+$)(?![0-9A-Z]+$)([0-9a-zA-Z]{6,})");
	}
	
	public static void main(String[] args) {
		System.out.println(validatePassword("1Aaaa3_34"));
	}

}
