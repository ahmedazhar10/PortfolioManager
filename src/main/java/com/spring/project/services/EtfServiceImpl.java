package com.spring.project.services;

import com.spring.project.entities.Etf;
import com.spring.project.repo.EtfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class EtfServiceImpl implements EtfService{

    @Autowired
    private EtfRepository repo;

    @Override
    public Etf getEtfById(int id) {
        Optional<Etf> etfOptional = repo.findById(id);
        return etfOptional.get();
    }

    @Override
    public Collection<Etf> getAllEtf() {
        return repo.findAll();
    }

    @Override
    public void updateEtf(Etf etf) {
        repo.save(etf);
    }

    @Override
    public void deleteEtf(Etf etf) {
        repo.delete(etf);
    }

    @Override
    public void addNewEtf(Etf etf) {
        repo.save(etf);
    }
}
