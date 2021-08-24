package com.spring.project.services;

import com.spring.project.entities.Etf;

import java.util.Collection;

public interface EtfService {

    Etf getEtfById(int id);

    Collection<Etf> getAllEtf();

    void updateEtf(Etf bond);

    void deleteEtf(Etf bond);

    void addNewEtf(Etf bond);


}
