package com.sample.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.demo.entity.Reg;

@Repository
public interface RegRespository extends JpaRepository<Reg,Long> {

}
