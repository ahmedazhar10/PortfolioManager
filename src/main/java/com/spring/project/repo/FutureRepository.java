package com.spring.project.repo;

import com.spring.project.entities.Future;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FutureRepository extends JpaRepository<Future, Integer> {
}
