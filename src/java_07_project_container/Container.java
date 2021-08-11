package java_07_project_container;

import java_07_project_dao.ArticleDao;
import java_07_project_dao.MemberDao;
import java_07_project_service.ArticleService;
import java_07_project_service.ExportService;
import java_07_project_service.MemberService;

public class Container {
	public static ArticleService articleService;
	public static ArticleDao articleDao;
	public static MemberDao memberDao;
	public static MemberService memberService;
	public static ExportService exportService;
	
	static {
		articleDao = new ArticleDao();
		memberDao = new MemberDao();
		articleService = new ArticleService();
		memberService = new MemberService();
		exportService = new ExportService();
	}
}
