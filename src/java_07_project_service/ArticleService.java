package java_07_project_service;

import java.util.List;

import java_07_project_container.Container;
import java_07_project_dao.ArticleDao;
import java_07_project_dto.Article;


public class ArticleService {

	private ArticleDao articleDao;

	public ArticleService() {
		this.articleDao = Container.articleDao;
	}

	public List<Article> getForPrintArticles(String searchKeyword) {
		return articleDao.getArticles(searchKeyword);
	}
	
	public List<Article> getForPrintArticles() {
		return articleDao.getArticles(null);
	}

	public int getArticleIndexById(int id) {
		return articleDao.getArticleIndexById(id);
	}

	public Article getArticleById(int id) {
		return articleDao.getArticleById(id);
	}

	public void remove(Article foundArticle) {
		articleDao.remove(foundArticle);

	}

}
