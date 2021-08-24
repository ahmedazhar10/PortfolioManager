package com.spring.project.services;

import com.spring.project.entities.Networth;
import com.spring.project.repo.NetworthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class NetworthServiceImpl implements NetworthService {

    @Autowired
    private NetworthRepository repo;


    @Override
    public Networth getNetworthById(int id) {
        Optional<Networth> networthOptional = repo.findById(id);
        return networthOptional.orElse(null);
    }

    @Override
    public Collection<Networth> getAllNetworth() {
        return repo.findAll();
    }

    @Override
    public Networth getNetworthByCashID(int cashID) {
        return null;
    }

    @Override
    public Networth getNetworthByName(String userName) {
        return null;
    }
}
