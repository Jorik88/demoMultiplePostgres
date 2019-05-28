package com.example.demoMultiplePostgres.second.repository;

import com.example.demoMultiplePostgres.second.domain.FiatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiatRepository extends JpaRepository<FiatEntity, Long> {
}
