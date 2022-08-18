package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="articles")//en caso que la tabla sea diferente

public class Article {
	
	//Atributos de entidad cliente
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name = "name")
		private String name;
		@Column(name = "price")
		private int price;
		
		@ManyToOne
	    @JoinColumn(name="manufacturer")
	    private Manufacturer manufacturer;

		//Constructors
		/**
		 * 
		 */
		public Article() {
			
		}

		
		/**
		 * @param id
		 * @param name
		 * @param price
		 * @param manufacturer
		 */
		public Article(Long id, String name, int price, Manufacturer manufacturer) {
			this.id = id;
			this.name = name;
			this.price = price;
			this.manufacturer = manufacturer;
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
		 * @return the price
		 */
		public int getPrice() {
			return price;
		}


		/**
		 * @param price the price to set
		 */
		public void setPrice(int price) {
			this.price = price;
		}


		/**
		 * @return the manufacturer
		 */
		public Manufacturer getManufacturer() {
			return manufacturer;
		}


		/**
		 * @param manufacturer the manufacturer to set
		 */
		public void setManufacturer(Manufacturer manufacturer) {
			this.manufacturer = manufacturer;
		}


		@Override
		public String toString() {
			return "Article [id=" + id + ", name=" + name + ", price=" + price + ", manufacturer=" + manufacturer + "]";
		}
		
	

}