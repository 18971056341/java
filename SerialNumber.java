package util;

/**
 *����ָ����ˮ�ŵ���һ����ˮ�ţ��磺"0002"����һ����"0003","0099"����һ����"0100"
 */
public class SerialNumber {
	public static String getNext(String no) {
		String newNo="";
		if(no==null) {
			no="0000";
		}
		newNo=String.valueOf(Integer.parseInt(no)+1);
		int zeroNumber=4-newNo.length();
		for(int i=0;i<zeroNumber;i++) {
			newNo = "0"+newNo;
		}
		return newNo;
	}

}
