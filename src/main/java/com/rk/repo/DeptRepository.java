package com.rk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.Model.Dept;

public interface DeptRepository extends JpaRepository<Dept, Integer>{

}
