package com.spring.project.controller;

import com.spring.project.entities.Networth;
import com.spring.project.services.NetworthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/portfoliomanager/networth")
@CrossOrigin
public class NetworthController {

    @Autowired
    private NetworthService service;

    @RequestMapping(method = RequestMethod.GET, value = "/{ID}")
    public Networth getNetworthById(@PathVariable("ID") int id){
        return service.getNetworthById(id);
    }

    @GetMapping
    public Collection<Networth> getAllNetworth(){
        return service.getAllNetworth();
    }

    @PutMapping
    public void updateNetworth(Networth networth){
        service.updateNetworth(networth);
    }

    @DeleteMapping
    public void deleteNetworth(Networth networth){
        service.deleteNetworth(networth);
    }

    @PostMapping
    public void addNewNetworth(Networth networth){
        service.addNewNetworth(networth);
    }

}
