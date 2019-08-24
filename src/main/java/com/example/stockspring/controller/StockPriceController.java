package com.example.stockspring.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.SectorDao;
import com.example.stockspring.dao.StockPriceDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.Sector;
import com.example.stockspring.model.StockPrice;
import com.example.stockspring.service.CompanyService;

public class StockPriceController {
	
	 @Autowired
	 StockPriceDao stockPriceDao;
	 
	 @Autowired
     SectorDao sectorDao;
	 
	 @Autowired
	 CompanyDao companyDao;

	@GetMapping("/sectors/price/{name}/{fromdate}/{todate}")
	public Double getsectorpriceList(@PathVariable("name") String name,@PathVariable("fromdate") Date fromdate,@PathVariable("todate") Date todate)
	{
	       System.out.println("hii");
	       Sector sectors=sectorDao.findBySectorName(name);
	       List<Double> stockprice=new ArrayList<Double>();
	       List<Company> companies =new ArrayList<>(); 
	       companyDao.findBySectorId(sectors.getSectorId()).forEach(companies::add);
	       int[] companyCode=new int[10];
	       Double total=0.0;
	       for(int i=0,k=0;i<companies.size();i++,k++)
	       {
	       companyCode[k]=companies.get(i).getCompanyCode();
	         stockPriceDao.getStockPrice(companyCode[k], fromdate, todate).forEach(stockprice::add);
	       }
	       for(int j=0;j<stockprice.size();j++)
	       {
	              total=total+stockprice.get(j);
	       }
	       //System.out.println(stockprice);
	       //return stockprice;
	       return total;
	}


}
