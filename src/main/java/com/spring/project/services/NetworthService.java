package com.spring.project.services;

import com.spring.project.entities.Networth;

import java.util.Collection;

public interface NetworthService {

    Networth getNetworthById(int id);

    Collection<Networth> getAllNetworth();

    Networth getNetworthByCashID(int cashID);

    Networth getNetworthByName(String userName);

    void updateNetworth(Networth networth);

    void deleteNetworth(Networth networth);

    void addNewNetworth(Networth networth);

}
