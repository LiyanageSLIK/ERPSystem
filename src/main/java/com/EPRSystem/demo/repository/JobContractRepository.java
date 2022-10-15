package com.EPRSystem.demo.repository;

import com.EPRSystem.demo.entity.EmployeeEntity;
import com.EPRSystem.demo.entity.JobContractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobContractRepository extends JpaRepository<JobContractEntity,Long> {
}
