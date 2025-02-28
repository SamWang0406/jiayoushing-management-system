package com.jiayoushing.management.system.dm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiayoushing.management.system.dm.model.Equipments;
import java.util.Optional;


@Repository
public interface EquipmentsRepository extends JpaRepository<Equipments, Integer>{
  Optional<Equipments> findById(Integer id);
}
