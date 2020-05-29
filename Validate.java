package util;
/**
 * ����������ʽ��װ������������ĸ�ʽУ��
 */
public class Validate {
	//��Ʒ������ֻ����6λ����
	public static boolean validateBarcode(String barcode) {
		return barcode.matches("\\d{6}");
	}
	
	//yyyy-MM-dd��ʽ�����ڸ�ʽ
	public static boolean  validateDate(String date) {
		return date.matches("\\d{4}-[01]\\d{1}-[0123]\\d{1}");
	}
	
	/**
	 * ���븴����У��
	 * 1.����ȫ���� (?![0-9]+$)
	 * 2.��ȫȫ��ĸ (?![a-zA-Z]+$)
	 * 3.����ȫ���ֻ�Сд (?![0-9a-z]+$)
	 * 4.����ȫ���ֻ�Сд (?![0-9A-Z]+$)
	 * 5.���ֻ���ĸ������6λ([0-9a-zA-Z]{6,})
	 * 
	 */
	public static boolean validatePassword(String password) {
		return password.matches("(?![0-9]+$)(?![a-zA-Z]+$)(?![0-9a-z]+$)(?![0-9A-Z]+$)([0-9a-zA-Z]{6,})");
	}
	
	public static void main(String[] args) {
		System.out.println(validatePassword("1Aaaa3_34"));
	}

}
