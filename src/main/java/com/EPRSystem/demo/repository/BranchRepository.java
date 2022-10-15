package com.EPRSystem.demo.repository;

import com.EPRSystem.demo.entity.BranchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<BranchEntity,Long> {
}
