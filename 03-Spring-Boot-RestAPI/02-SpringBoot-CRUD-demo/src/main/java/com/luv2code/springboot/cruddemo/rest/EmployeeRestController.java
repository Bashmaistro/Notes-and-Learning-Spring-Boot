package com.luv2code.springboot.cruddemo.rest;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;
import jakarta.persistence.EntityManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;
    //quick and dirt: inject employee dao

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //expose "/employees" and return a list of employees

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeID}")
    public Employee findByID(@PathVariable int employeeID){

        Employee employee = employeeService.findById(employeeID);

        if (employee == null){
            throw new RuntimeException("Employee id not found - " + employeeID );

        }

        return  employeeService.findById(employeeID);

    }

    //Mapping for Adding new employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){

    //also in case they pass an id in JSON.... set id to 0
    //this is force a save of new item..... instead of update

    theEmployee.setId(0);

    Employee dbEmployee = employeeService.save(theEmployee);

    return dbEmployee;

    }

    //Mapping for Updating new employee
    @PutMapping ("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){

        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;


    }

    //MApping for Deleting employee
    @DeleteMapping("/employees/{employeeID}")
    public String  deleteEmployee(@PathVariable  int employeeID){

        Employee theEmployee = employeeService.findById(employeeID);

        //throw exception if null
        if (theEmployee == null) {

            throw new RuntimeException("Employee id not found -" + employeeID);

        }

        employeeService.deleteById(theEmployee.getId());

        return "Deleted employee id - " + employeeID;

    }





}
