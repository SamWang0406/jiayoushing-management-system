package com.jiayoushing.management.system.dm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiayoushing.management.system.dm.model.Materials;
import java.util.Optional;


@Repository
public interface MaterialsRepository extends JpaRepository<Materials, Integer>{
  Optional<Materials> findById(Integer id);
}
