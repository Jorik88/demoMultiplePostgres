package com.example.demoMultiplePostgres.first.repository;

import com.example.demoMultiplePostgres.first.domain.LimitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LimitRepository extends JpaRepository<LimitEntity, Long> {
}
