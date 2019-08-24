package com.example.stockspring.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.stockspring.model.StockPrice;

public interface StockPriceDao extends JpaRepository<StockPrice, Integer>{
      List<StockPrice> findByCompanyCode(int companyCode);

    	  	@Query("Select s.currentPrice from StockPrice s where s.companyCode= :companyCode and s.date between :fromdate and :todate ")
    	  	public List<Double> getStockPrice(@Param("companyCode") int companyCode,@Param("fromdate") Date fromdate,@Param("todate") Date todate); 
    	  
    	  
}
