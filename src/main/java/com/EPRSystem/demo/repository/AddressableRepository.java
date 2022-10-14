package com.EPRSystem.demo.repository;

import com.EPRSystem.demo.entity.AddressableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressableRepository extends JpaRepository<AddressableEntity,Long> {
}
