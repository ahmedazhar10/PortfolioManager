package com.spring.project.services;

import com.spring.project.entities.Bond;

import java.util.Collection;

public interface BondService {

    Bond getBondById(int id);

    Collection<Bond> getAllBond();

    void updateBond(Bond bond);

    void deleteBond(Bond bond);

    void addNewBond(Bond bond);

}
