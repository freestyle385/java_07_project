package java_07_project;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Exam {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date time = new Date(); // 'Wed Jul 21 23:30:42 KST 2021' �⺻ ������ �ð��� �������� ��ü ����

		String timeString = dateFormat.format(time); // "yyyy-MM-dd HH:mm:ss"�� ���� ��ȯ

		System.out.println(time); // �⺻ �������� ���
		System.out.println(timeString); // ��ȯ�� �������� ���
	}
}
