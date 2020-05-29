package util;

/**
 *生成指定流水号的下一个流水号，如："0002"的下一个是"0003","0099"的下一个是"0100"
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
