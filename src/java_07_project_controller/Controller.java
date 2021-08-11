package java_07_project_controller;

import java_07_project_dto.Member;

public abstract class Controller {
	public static Member loginedMember;

	public static boolean isLogined() {
		return loginedMember != null;
	}

	public abstract void doAction(String command, String actionMethodName);

	public abstract void makeTestData();
}
