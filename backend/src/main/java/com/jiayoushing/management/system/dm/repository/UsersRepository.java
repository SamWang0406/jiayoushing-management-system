package com.jiayoushing.management.system.dm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiayoushing.management.system.dm.model.Users;
import java.util.Optional;


@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{
  Optional<Users> findById(Integer id);
}
