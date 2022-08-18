package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IArticleDAO;
import com.example.demo.dto.Article;

@Service
public class ArticleServiceImpl implements IArticleService{

	@Autowired
	IArticleDAO iArticleDAO;
	
	@Override
	public List<Article> listArticles() {
		
		return iArticleDAO.findAll();
	}

	@Override
	public Article saveArticle(Article article) {
		
		return iArticleDAO.save(article);
	}

	@Override
	public Article articleByID(Long id) {
	
		return iArticleDAO.findById(id).get();
	}

	@Override
	public Article updateArticle(Article article) {
		
		return iArticleDAO.save(article);
	}

	@Override
	public void deleteArticle(Long id) {
		
		iArticleDAO.deleteById(id);
	}

}
