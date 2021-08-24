package com.spring.project.repo;

import com.spring.project.entities.CashAccounts;
import com.spring.project.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CashAccountRepository extends JpaRepository<CashAccounts, Integer> {

    Collection<CashAccounts> findByInstitution(String institution);

}
