package com.spring.project.controller;

import com.spring.project.entities.Bond;
import com.spring.project.services.BondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/portfoliomanager/bond")
@CrossOrigin
public class BondController {

    @Autowired
    private BondService service;

    @RequestMapping(method = RequestMethod.GET, value = "/{ID}")
    public Bond getBondhById(@PathVariable("ID") int id){
        return service.getBondById(id);
    }

    @GetMapping
    public Collection<Bond> getAllBond(){
        return service.getAllBond();
    }

    @PutMapping
    public void updateBond(Bond bond){
        service.updateBond(bond);
    }

    @DeleteMapping
    public void deleteBond(Bond bond){
        service.deleteBond(bond);
    }

    @PostMapping
    public void addNewBond(Bond bond){
        service.addNewBond(bond);
    }

}
