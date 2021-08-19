package com.spring.project.services;

import com.spring.project.entities.CashAccounts;

import java.util.Collection;

public interface CashAccountService {

    CashAccounts getCashAccountsById(int id);

    Collection<CashAccounts> getAllCashAccounts();

    Collection<CashAccounts> getCashAccountByInstitution(String institution);

    int getCashValue(CashAccounts ca);

    String getHolderName(CashAccounts ca);

    void updateCashAccounts(CashAccounts ca);

    void deleteCashAccounts(CashAccounts ca);

    void addNewCashAccounts(CashAccounts ca);

    void deleteCashAccountsByID(int id);

}
