package com.spring.project.controller;

import com.spring.project.entities.Bond;
import com.spring.project.entities.Etf;
import com.spring.project.services.BondService;
import com.spring.project.services.EtfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/portfoliomanager/etf")
@CrossOrigin
public class EtfController {

    @Autowired
    private EtfService service;

    @RequestMapping(method = RequestMethod.GET, value = "/{ID}")
    public Etf getEtfById(@PathVariable("ID") int id){
        return service.getEtfById(id);
    }

    @GetMapping
    public Collection<Etf> getAllEtf(){
        return service.getAllEtf();
    }

    @PutMapping
    public void updateEtf(Etf etf){
        service.updateEtf(etf);
    }

    @DeleteMapping
    public void deleteEtf(Etf etf){
        service.deleteEtf(etf);
    }

    @PostMapping
    public void addNewEtf(Etf etf){
        service.addNewEtf(etf);
    }

}
