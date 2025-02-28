package com.jiayoushing.management.system.dm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiayoushing.management.system.dm.model.DailyRecords;
import java.util.Optional;


@Repository
public interface DailyRecordsRepository extends JpaRepository<DailyRecords, Integer>{
  Optional<DailyRecords> findById(Integer id);
}
