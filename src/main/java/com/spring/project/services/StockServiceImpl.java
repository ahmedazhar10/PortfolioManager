package com.spring.project.services;

import com.spring.project.entities.Stock;
import com.spring.project.repo.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockService{

    @Autowired
    private StockRepository repo;

    @Override
    public Stock getStockById(int id) {
        Optional<Stock> stockOptional = repo.findById(id);
        return stockOptional.get();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Collection<Stock> getAllStocks() {
        return repo.findAll();
    }

    @Override
    public void addNewStock(Stock stock) {
        stock.setId(0);
        repo.save(stock);
    }

    @Override
    public void deleteStock(Stock stock) {
        repo.delete(stock);
    }

    @Override
    public void deleteStockById(int id) {
        Stock stock = repo.findById(id).get();
        deleteStock(stock);
    }

    @Override
    public void updateStock(Stock stock) {
        repo.save(stock);
    }


}
