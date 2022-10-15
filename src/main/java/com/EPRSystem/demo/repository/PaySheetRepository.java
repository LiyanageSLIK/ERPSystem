package com.EPRSystem.demo.repository;

import com.EPRSystem.demo.entity.PaySheetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaySheetRepository extends JpaRepository<PaySheetEntity,Long> {
}
