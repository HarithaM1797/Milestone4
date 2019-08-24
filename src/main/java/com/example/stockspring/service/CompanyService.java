package com.example.stockspring.service;

import java.util.List;

import com.example.stockspring.model.Company;

public interface CompanyService {
	  public Company insertCompany(Company company) throws Exception;
	  
	  public Company updateCompany(Company company) throws Exception;
	  
	  public List<Company> getCompanyList() throws Exception;
	  
	  public List<Company> getCompanyListSector(String sectorName) throws Exception;
	  
	  public List<Company> getMatchingCompanies(String name) throws Exception;
}
