package com.EPRSystem.demo.repository;

import com.EPRSystem.demo.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity,Long> {
}
