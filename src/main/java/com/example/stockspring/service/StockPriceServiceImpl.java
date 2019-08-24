package com.example.stockspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.StockPriceDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.StockPrice;

@Service
public class StockPriceServiceImpl implements StockPriceService{
	@Autowired
	private CompanyDao companyDao;
	
	@Autowired
	private StockPriceDao stockPriceDao;
	
	@Override
	public List<StockPrice> getStockPriceCompany(String companyName) {
		Company company = companyDao.findByCompanyName(companyName);
		return stockPriceDao.findByCompanyCode(company.getCompanyCode());
	}

}
