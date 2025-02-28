package com.jiayoushing.management.system.dm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiayoushing.management.system.dm.model.Role;
import java.util.Optional;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
  Optional<Role> findById(Integer id);
}
