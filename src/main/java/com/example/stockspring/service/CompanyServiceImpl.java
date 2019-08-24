package com.example.stockspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.stockspring.dao.*;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.Sector;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyDao companyDao;
	
	@Autowired
	private SectorDao sectorDao;
	
	public Company insertCompany(Company company) throws Exception {
		return companyDao.save(company);
	}

	public Company updateCompany(Company company) throws Exception {
		return companyDao.saveAndFlush(company);
	
	}

	public List<Company> getCompanyList() throws Exception {
		return companyDao.findAll();
	}

	public List<Company> getCompanyListSector(String sectorName) throws Exception {
		Sector sector = sectorDao.findBySectorName(sectorName);
		return companyDao.findBySectorId(sector.getSectorId());
	}

	public List<Company> getMatchingCompanies(String name) throws Exception {
		return companyDao.findByMatchingCompanyName(name);
	}
}
