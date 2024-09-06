package com.graymatter.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.graymatter.entities.Department;
 
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
 
}