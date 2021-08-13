package com.spring.project.services;

import com.spring.project.entities.Stock;

import java.util.Collection;

public interface StockService {

    Stock getStockById(int id);

    Collection<Stock> getStockByTicker(String ticker);

    Collection<Stock> getAllStocks();

    void addNewStock(Stock stock);

    void deleteStock(Stock stock);

    void deleteStockById(int id);

    void updateStock(Stock stock);

}
