package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{


    //ddefine field for entity manager
    private EntityManager entityManager;

    //inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implement save method
    @Override
    @Transactional
    public void save(Student thestudent) {
         entityManager.persist(thestudent);
         
    }

    //There is no need for transactional cuz we don't any update in database just read operation
    @Override
    public Student findById(Integer key){
        return  entityManager.find(Student.class, key);
    }

    @Override
    public List<Student> getStudents() {

        //create query
        TypedQuery<Student> theQuery = entityManager.createQuery("From Student order by firstName" , Student.class);

        //return list object
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lName) {

        //Creating querry and  list
        TypedQuery<Student> theQuery = entityManager.createQuery(
                "from  Student where lastName=:thedata",
                Student.class);

        //Set paramaters
        theQuery.setParameter("thedata" , lName);

        //Return the list
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student thestudent) {

        entityManager.merge(thestudent);
    }

    //We make some changes on database for this
    // reason we need the use transactional annotations
    @Override
    @Transactional
    public void delete(Integer Id) {

        //Finding student by id, but we can
        //implement with finding id of the student with other method
        //in main app after that we can take student object as an argument
        Student theStudent = entityManager.find(Student.class, Id);

        //Removing phase
        entityManager.remove(theStudent);


    }
}
