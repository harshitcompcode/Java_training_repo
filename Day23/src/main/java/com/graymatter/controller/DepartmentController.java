
 
package com.graymatter.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.graymatter.entities.Department;
import com.graymatter.service.DepartmentServiceImpl;
 
@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {
	@Autowired
	DepartmentServiceImpl service;
    @GetMapping("/department")
    public List<Department> getAllDepartment() {
        return service.getAllDepartment();
    }
    @PostMapping("/department")
    public Department addDepartment(@RequestBody Department department) {
        return service.addDepartment(department);
    }
    @DeleteMapping("/department/{id}")
    public int deleteDepartment(@PathVariable int id) {
    	return service.deleteDepartment(id);
    }

 
}