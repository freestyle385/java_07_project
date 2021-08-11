package java_07_project;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Exam {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date time = new Date();

		String timeString = dateFormat.format(time);

		System.out.println(time);
		System.out.println(timeString);
	}
}
