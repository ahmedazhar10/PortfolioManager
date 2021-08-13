package com.spring.project.repo;

import com.spring.project.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Iterator;

@Repository
// Still needs to extend JpaRepository
public interface StockRepository extends JpaRepository<Stock, Integer>{

    Collection<Stock> findByTicker(String ticker);

}
