package com.spring.project.controller;

import com.spring.project.entities.CashAccounts;
import com.spring.project.services.CashAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/portfoliomanager/cashaccounts")
@CrossOrigin
public class CashAccountController {

    @Autowired
    private CashAccountService service;

    @RequestMapping(method = RequestMethod.GET, value = "/{ID}")
    public CashAccounts getCashAccountsById(@PathVariable("ID") int id){
        return service.getCashAccountsById(id);
    }

    @GetMapping
    public Collection<CashAccounts> getAllCashAccounts(){
        return service.getAllCashAccounts();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{institution}")
    public Collection<CashAccounts> getCashAccountByInstitution(@PathVariable("institution") String institution){
        return service.getCashAccountByInstitution(institution);
    }

//    @GetMapping
//    public int getCashValue(CashAccounts ca){
//        return service.getCashValue(ca);
//    }
//
//    @GetMapping
//    public String getHolderName(CashAccounts ca){
//        return service.getHolderName(ca);
//    }

    @PutMapping
    public void updateCashAccounts(CashAccounts ca){
        service.updateCashAccounts(ca);
    }

    @DeleteMapping
    public void deleteCashAccounts(CashAccounts ca){
        service.deleteCashAccounts(ca);
    }

    @PostMapping
    public void addNewCashAccounts(CashAccounts ca){
        service.addNewCashAccounts(ca);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{ID}")
    public void deleteCashAccountsByID(int id){
        service.deleteCashAccountsByID(id);
    }
}
