package com.example.stockspring.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.model.StockPrice;
import com.example.stockspring.service.CompanyService;
import com.example.stockspring.service.IpoPlanedService;
import com.example.stockspring.service.SectorService;
import com.example.stockspring.service.StockPriceService;
import com.example.stockspring.model.IpoPlaned;
import com.example.stockspring.model.Sector;
import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.StockPriceDao;
import com.example.stockspring.model.Company;

@RestController
public class SectorRestController {
      @Autowired
      CompanyService companyService;
      
      @Autowired
      StockPriceService stockPriceService;
      
      @Autowired
      SectorService sectorService;
      
      @Autowired
      IpoPlanedService ipoPlanedService;
      
      @Autowired
      CompanyDao companyDao;
      
      @Autowired
      StockPriceDao stockpriceDao;
      
      

	  @GetMapping("/companyList/{name}")
      public List<Company> getCompanyList(@PathVariable("name") String sectorName) throws Exception
      {
		  return companyService.getCompanyListSector(sectorName);
      }
	
	  
	
	  @GetMapping("/matchingCompanyList/{name}")
	  public List<Company> getMatchingCompanyList(@PathVariable("name") String name) throws Exception
	  {
		  return companyService.getMatchingCompanies(name);
	  }
	 
	  @GetMapping("/matchingDate/{name}/{fromdate}/{todate}")
	  public List<Double> getMatchingDate(@PathVariable("name") String companyName ,@PathVariable("fromdate") Date fromdate , @PathVariable("todate") Date todate ) throws Exception
	  {
		  
			  		
					Company company = companyDao.findByCompanyName(companyName);
			  		int companyCode = company.getCompanyCode();
			  		System.out.println(companyCode);
			  		List<Double> stockprice = stockpriceDao.getStockPrice(companyCode,fromdate,todate);
			  		return stockprice;
	  }
	

}
