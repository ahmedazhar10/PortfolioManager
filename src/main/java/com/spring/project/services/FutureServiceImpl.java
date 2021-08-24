package com.spring.project.services;

import com.spring.project.entities.Future;
import com.spring.project.repo.FutureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class FutureServiceImpl implements FutureService {

    @Autowired
    private FutureRepository repo;

    @Override
    public Future getFutureById(int id) {
        Optional<Future> futureOptional = repo.findById(id);
        return futureOptional.get();
    }

    @Override
    public Collection<Future> getAllFuture() {
        return repo.findAll();
    }

    @Override
    public void updateFuture(Future future) {
        repo.save(future);
    }

    @Override
    public void deleteFuture(Future future) {
        repo.delete(future);
    }

    @Override
    public void addNewFuture(Future future) {
        repo.save(future);
    }
}
