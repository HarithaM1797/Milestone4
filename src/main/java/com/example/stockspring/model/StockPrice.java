package com.example.stockspring.model;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="stock_price")
public class StockPrice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stockprice_id")
	private int stockPriceId;
	
	@Column(name="company_code")
	private int companyCode;
	
	@Column(name="stock_exchange")
	private String stockExchange;
	
	@Column(name="current_price")
	private double currentPrice;
	
	@Column(name="date")
	private Date date;	
	
	public int getStockPriceId() {
		return stockPriceId;
	}

	public void setStockPriceId(int stockPriceId) {
		this.stockPriceId = stockPriceId;
	}

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
    
}
