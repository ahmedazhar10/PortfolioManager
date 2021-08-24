package com.spring.project.repo;

import com.spring.project.entities.Networth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworthRepository extends JpaRepository<Networth, Integer> {
}
