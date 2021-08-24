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
        return networthOptional.get();
    }

    @Override
    public Collection<Networth> getAllNetworth() {
        return repo.findAll();
    }

    @Override
    public void updateNetworth(Networth networth) {
        repo.save(networth);
    }

    @Override
    public void deleteNetworth(Networth networth) {
        repo.delete(networth);
    }

    @Override
    public void addNewNetworth(Networth networth) {
        repo.save(networth);
    }
}
