package com.spring.project.services;

import com.spring.project.entities.CashAccounts;
import com.spring.project.repo.CashAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class CashAccountImpl implements CashAccountService {

    @Autowired
    private CashAccountRepository repo;

    @Override
    public CashAccounts getCashAccountsById(int id) {
        Optional<CashAccounts> cashAccountsOptional = repo.findById(id);
        return cashAccountsOptional.orElse(null);
    }

    @Override
    public Collection<CashAccounts> getAllCashAccounts() {
        return repo.findAll();
    }

    @Override
    public Collection<CashAccounts> getCashAccountByInstitution(String institution) {
        Collection<CashAccounts> cashAccountsCollection = repo.findAll();
        for(CashAccounts ca : cashAccountsCollection){
            if(!institution.equals(ca.getInstitution())){
                cashAccountsCollection.remove(ca);
            }
        }
        return cashAccountsCollection;
    }

    @Override
    public void updateCashAccounts(CashAccounts ca) {
        repo.save(ca);
    }

    @Override
    public void deleteCashAccounts(CashAccounts ca) {
        repo.delete(ca);
    }

    @Override
    public void addNewCashAccounts(CashAccounts ca) {
        ca.setId(0);
        repo.save(ca);
    }

    @Override
    public void deleteCashAccountsByID(int id) {
        CashAccounts ca = repo.findById(id).get();
        deleteCashAccounts(ca);
    }
}
