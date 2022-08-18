package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Manufacturer;

public interface IManufacturerService {

	//Metodos del CRUD
		public List<Manufacturer> listManufacturers(); //Listar All 
		
		public Manufacturer saveManufacturer(Manufacturer manufacturer);	//Guarda un cliente CREATE
		
		public Manufacturer manufacturerByID(Long id); //Leer datos de un cliente READ
		
		public Manufacturer updateManufacturer(Manufacturer manufacturer); //Actualiza datos del cliente UPDATE
		
		public void deleteManufacturer(Long id);// Elimina el cliente DELETE
}
