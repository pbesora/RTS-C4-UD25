package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IManufacturerDAO;
import com.example.demo.dto.Manufacturer;

@Service
public class ManufacturerServiceImpl implements IManufacturerService{

	@Autowired
	IManufacturerDAO iManufacturerDAO;
	
	@Override
	public List<Manufacturer> listManufacturers() {
		
		return iManufacturerDAO.findAll();
	}

	@Override
	public Manufacturer saveManufacturer(Manufacturer manufacturer) {

		return iManufacturerDAO.save(manufacturer);
	}

	@Override
	public Manufacturer manufacturerByID(Long id) {
	
		return iManufacturerDAO.findById(id).get();
	}

	@Override
	public Manufacturer updateManufacturer(Manufacturer manufacturer) {
	
		return iManufacturerDAO.save(manufacturer);
	}

	@Override
	public void deleteManufacturer(Long id) {
		
		iManufacturerDAO.deleteById(id);
	}

}
