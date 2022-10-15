package com.EPRSystem.demo.repository;

import com.EPRSystem.demo.entity.IncentiveEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncentiveRepository extends JpaRepository<IncentiveEntity,Long> {
}
