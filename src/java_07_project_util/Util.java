package java_07_project_util;

import java.text.SimpleDateFormat;
import java.util.Date;
//?��?�� ?���? 리턴
public class Util {
	public static String getNowDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		
		return format.format(time);

	}
}
