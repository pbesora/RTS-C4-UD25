package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Article;


public interface IArticleService {
	//Metodos del CRUD
			public List<Article> listArticles(); //Listar All 
			
			public Article saveArticle(Article article);	//Guarda un video CREATE
			
			public Article articleByID(Long id); //Leer datos de un video READ
			
			public Article updateArticle(Article article); //Actualiza datos del video UPDATE
			
			public void deleteArticle(Long id);// Elimina el video DELETE
}
