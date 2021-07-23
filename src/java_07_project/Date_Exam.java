package java_07_project;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Exam {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date time = new Date(); // 'Wed Jul 21 23:30:42 KST 2021' 기본 형식인 시간을 가져오는 객체 생성

		String timeString = dateFormat.format(time); // "yyyy-MM-dd HH:mm:ss"로 형식 변환

		System.out.println(time); // 기본 형식으로 출력
		System.out.println(timeString); // 변환한 형식으로 출력
	}
}
