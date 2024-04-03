package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    private EntityManager entityManager;

    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {

        //create a querrt

        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee " , Employee.class);


        //execute querry and get result list
        List<Employee> employees = theQuery.getResultList();


        //returnresult
        return employees;
    }

    @Override
    public Employee findById(int ID) {

        Employee theEmployee = entityManager.find(Employee.class, ID);

        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {

        //save merge method understand itself there is new entry or updated entry
        Employee dbEmployee = entityManager.merge(theEmployee);


        return dbEmployee;
    }

    @Override
    public void deleteById(int ID) {

        Employee employee = entityManager.find(Employee.class, ID);

        //remove
        entityManager.remove(employee);



    }
}
