package java_07_project_controller;

import java.util.List;
import java.util.Scanner;

import java_07_project_container.Container;
import java_07_project_dto.Article;
import java_07_project_dto.Member;
import java_07_project_service.ArticleService;
import java_07_project_service.ExportService;
import java_07_project_util.Util;

public class ExportController extends Controller {
	private Scanner sc;
	private String command;
	private String actionMethodName;
	private ExportService exportService;

	public ExportController(Scanner sc) {
		this.sc = sc;
		exportService = Container.exportService;
	}

	public void doAction(String command, String actionMethodName) {
		this.command = command;
		this.actionMethodName = actionMethodName;

		switch (actionMethodName) {
		case "html":
			doHtml();
			break;
		default:
			System.out.println("존재하지 않는 명령어입니다.");
			break;
		}
	}

	private void doHtml() {
		System.out.println("html 생성을 시작합니다.");
		exportService.makeHtml();
	}

	@Override
	public void makeTestData() {

	}
}
