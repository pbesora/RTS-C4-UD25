package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="manufacturers")//en caso que la tabla sea diferente
public class Manufacturer  {
 
	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "name")//no hace falta si se llama igual
	private String name;
	
    @OneToMany
    @JoinColumn(name="id")
    private List<Article> article;
	
	//Constructores
	
	public Manufacturer() {
	
	}

	/**
	 * @param id
	 * @param name
	 * @param article
	 */
	public Manufacturer(Long id, String name, List<Article> article) {
		this.id = id;
		this.name = name;
		this.article = article;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the article
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Article")
	public List<Article> getArticle() {
		return article;
	}

	/**
	 * @param article the article to set
	 */
	public void setArticle(List<Article> article) {
		this.article = article;
	}

	
	@Override
	public String toString() {
		return "Manufacturer [id=" + id + ", name=" + name + "]";
	}

}
	
	
	