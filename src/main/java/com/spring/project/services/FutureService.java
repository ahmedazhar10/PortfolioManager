package com.spring.project.services;

import com.spring.project.entities.Future;

import java.util.Collection;

public interface FutureService {

    Future getFutureById(int id);

    Collection<Future> getAllFuture();

    void updateFuture(Future future);

    void deleteFuture(Future future);

    void addNewFuture(Future future);

}
