package com.jiayoushing.management.system.dm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiayoushing.management.system.dm.model.Sites;
import java.util.Optional;


@Repository
public interface SitesRepository extends JpaRepository<Sites, Integer>{
  Optional<Sites> findById(Integer id);
}
