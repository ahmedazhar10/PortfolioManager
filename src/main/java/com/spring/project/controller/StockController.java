package com.spring.project.controller;

import com.spring.project.entities.Stock;
import com.spring.project.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/portfoliomanager")
@CrossOrigin
public class StockController {

    @Autowired
    private StockService service;

    @RequestMapping(method = RequestMethod.GET, value = "/{ID}")
    public Stock getStockById(@PathVariable("id") int id){
        return service.getStockById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{ticker}")
    public Collection<Stock> getStockByTicker(@PathVariable("ticker") String ticker){
        return service.getStockByTicker(ticker);
    }

//    @ApiOperation(value = "getAllStocks", nickname = "getAllStocks")
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Stock> getAllStocks(){
        return service.getAllStocks();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewStock(@RequestBody Stock stock){
        service.addNewStock(stock);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteStock(Stock stock){
        service.deleteStock(stock);
    }

//    @DeleteMapping
//    public void deleteStockById(@RequestBody int id){
//        service.deleteStockById(id);
//    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateStock(@RequestBody Stock stock){
        service.updateStock(stock);
    }

}
