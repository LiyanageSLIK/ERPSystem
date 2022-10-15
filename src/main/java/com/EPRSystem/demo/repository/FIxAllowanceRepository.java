package com.EPRSystem.demo.repository;

import com.EPRSystem.demo.entity.FixAllowanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FIxAllowanceRepository extends JpaRepository<FixAllowanceEntity,Long> {
}
