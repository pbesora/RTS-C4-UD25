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

import com.example.demo.dto.Manufacturer;
import com.example.demo.service.ManufacturerServiceImpl;


@RestController
@RequestMapping("/api")
public class ManufacturerController {
	
	@Autowired
	ManufacturerServiceImpl manufacturerServiceImpl;
	
	@GetMapping("/manufacturers")
	public List<Manufacturer> listManufacturers(){
		return manufacturerServiceImpl.listManufacturers();
	}
	
	@PostMapping("/manufacturers")
	public Manufacturer saveManufacturer(@RequestBody Manufacturer manufacturer) {
		
		return manufacturerServiceImpl.saveManufacturer(manufacturer);
	}
	
	@GetMapping("/manufacturers/{id}")
	public Manufacturer manufacturerByID(@PathVariable(name="id") Long id) {
		
		Manufacturer manufacturer_byid= new Manufacturer();
		
		manufacturer_byid = manufacturerServiceImpl.manufacturerByID(id);
		
		System.out.println("Manufacturer by ID: " + manufacturer_byid);
		
		return manufacturer_byid;
	}
	
	@PutMapping("/manufacturers/{id}")
	public Manufacturer updateManufacturer(@PathVariable(name="id")Long id,@RequestBody Manufacturer manufacturer) {
		
		Manufacturer manufacturer_selected= new Manufacturer();
		Manufacturer manufacturer_updated= new Manufacturer();
		
		manufacturer_selected= manufacturerServiceImpl.manufacturerByID(id);
		
		manufacturer_selected.setName(manufacturer.getName());
		
		manufacturer_updated = manufacturerServiceImpl.updateManufacturer(manufacturer_selected);
		
		System.out.println("El manufacturer updated es: "+ manufacturer_updated);
		
		return manufacturer_updated;
	}
	
	@DeleteMapping("/manufacturers/{id}")
	public void deleteManufacturer(@PathVariable(name="id")Long id) {
		manufacturerServiceImpl.deleteManufacturer(id);
	}
	
	
}