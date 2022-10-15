package com.EPRSystem.demo.repository;

import com.EPRSystem.demo.entity.AssignEmployeeEntity;
import com.EPRSystem.demo.entity.Key.AssignEmployeeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignEmployeeRepository extends JpaRepository<AssignEmployeeEntity, AssignEmployeeKey> {
}
