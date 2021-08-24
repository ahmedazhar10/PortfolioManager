package com.spring.project.repo;

import com.spring.project.entities.Etf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtfRepository extends JpaRepository<Etf, Integer> {
}
