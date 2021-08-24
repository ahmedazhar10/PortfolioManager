package com.spring.project.controller;

import com.spring.project.entities.Etf;
import com.spring.project.entities.Future;
import com.spring.project.services.FutureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/portfoliomanager/future")
@CrossOrigin
public class FutureController {

    @Autowired
    private FutureService service;

    @RequestMapping(method = RequestMethod.GET, value = "/{ID}")
    public Future getFutureById(@PathVariable("ID") int id){
        return service.getFutureById(id);
    }

    @GetMapping
    public Collection<Future> getAllFuture(){
        return service.getAllFuture();
    }

    @PutMapping
    public void updateFuture(Future future){
        service.updateFuture(future);
    }

    @DeleteMapping
    public void deleteFuture(Future future){
        service.deleteFuture(future);
    }

    @PostMapping
    public void addNewFuture(Future future){
        service.addNewFuture(future);
    }

}
