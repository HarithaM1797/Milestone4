package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.SectorDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.Sector;
@Service
public class SectorServiceImpl implements SectorService {
	@Autowired
	private SectorDao sectorDao;
	public Sector Insert(Sector sector) throws ClassNotFoundException, SQLException {
		return sectorDao.save(sector);
	}

	public List<Sector> GetAllSector() throws ClassNotFoundException, SQLException {
		return sectorDao.findAll();
	}


	
}
