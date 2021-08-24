package com.spring.project.services;

import com.spring.project.entities.Bond;
import com.spring.project.repo.BondRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class BondServiceImpl implements BondService{

    @Autowired
    private BondRepository repo;

    @Override
    public Bond getBondById(int id) {
        Optional<Bond> bondOptional = repo.findById(id);
        return bondOptional.get();
    }

    @Override
    public Collection<Bond> getAllBond() {
        return repo.findAll();
    }

    @Override
    public void updateBond(Bond bond) {
        repo.save(bond);
    }

    @Override
    public void deleteBond(Bond bond) {
        repo.delete(bond);
    }

    @Override
    public void addNewBond(Bond bond) {
        repo.save(bond);
    }
}
