package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Article;
import com.example.demo.service.ArticleServiceImpl;



@RestController
@RequestMapping("/api")
public class ArticleController {

	@Autowired
	ArticleServiceImpl articleServideImpl;
	
	@GetMapping("/articles")
	public List<Article> listArticles(){
		return articleServideImpl.listArticles();
	}
	
	@PostMapping("/articles")
	public Article saveArticles(@RequestBody Article article) {
		
		return articleServideImpl.saveArticle(article);
	}
	
	@GetMapping("/articles/{id}")
	public Article articleByID(@PathVariable(name="id") Long id) {
		
		Article article_xid= new Article();
		
		article_xid=articleServideImpl.articleByID(id);
		
		System.out.println("Article XID: "+article_xid);
		
		return article_xid;
	}
	
	@PutMapping("/articles/{id}")
	public Article updateArticle(@PathVariable(name="id")Long id,@RequestBody Article article) {
		
		Article article_selected = new Article();
		Article article_updated = new Article();
		
		article_selected= articleServideImpl.articleByID(id);
		
		article_selected.setName(article.getName());
		article_selected.setPrice(article.getPrice());
		article_selected.setManufacturer(article.getManufacturer());
		
		article_updated = articleServideImpl.updateArticle(article_selected);
		
		System.out.println("El article actualizado es: " + article_updated);
		
		return article_updated;
	}
	
	@DeleteMapping("/articles/{id}")
	public void deleteArticle(@PathVariable(name="id")Long id) {
		articleServideImpl.deleteArticle(id);
	}
	
}