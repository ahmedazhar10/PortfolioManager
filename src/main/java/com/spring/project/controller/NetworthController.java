package com.spring.project.controller;

import com.spring.project.services.NetworthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/portfoliomanager/networth")
@CrossOrigin
public class NetworthController {

    @Autowired
    private NetworthService service;

}
