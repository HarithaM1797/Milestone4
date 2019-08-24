package com.example.stockspring.dao;

import java.util.List;

import com.example.stockspring.model.StockExchange;


public interface StockExchangeDao {
	public StockExchange insertStock(StockExchange stockEx);
	public List<StockExchange> GetAllStock();
}
