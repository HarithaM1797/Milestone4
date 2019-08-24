package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.Sector;

public interface SectorService {
	public Sector Insert (Sector sector)throws ClassNotFoundException, SQLException;
	public List<Sector> GetAllSector()throws ClassNotFoundException, SQLException;
	
	
	
}
