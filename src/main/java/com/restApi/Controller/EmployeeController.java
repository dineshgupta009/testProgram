package com.restApi.Controller;

import com.restApi.Entity.Employee;
import com.restApi.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/employee")
    public List<Employee> getEmployee(){
        return employeeRepo.findAll();
    }

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeRepo.save(employee);
    }

}
