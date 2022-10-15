package com.EPRSystem.demo.repository;

import com.EPRSystem.demo.entity.AddressableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressableRepository extends JpaRepository<AddressableEntity,Long> {
}
