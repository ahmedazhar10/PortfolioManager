package com.spring.project.services;

import com.spring.project.entities.Networth;

import java.util.Collection;

public interface NetworthService {

    Networth getNetworthById(int id);

    Collection<Networth> getAllNetworth();

    Networth getNetworthByCashID(int cashID);

    Networth getNetworthByInvestmentID(int investmentID);

    Networth getNetworthByName(String userName);

}
