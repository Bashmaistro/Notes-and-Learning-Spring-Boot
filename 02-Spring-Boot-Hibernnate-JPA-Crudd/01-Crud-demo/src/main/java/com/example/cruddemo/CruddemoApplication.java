package com.example.cruddemo;

import com.example.cruddemo.dao.StudentDAO;
import com.example.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		return runner -> {
			//changeName(studentDAO);

			//removeStudent(studentDAO);
		};


	}

	private void removeStudent(StudentDAO studentDAO) {

		//Just pushed the id of the student
		studentDAO.delete(3);

		//For control
		System.out.println("Deleting student.....");
		Student mystudent = studentDAO.findById(3);
		if (mystudent == null){
			System.out.println("Deleting is successful");

		}else {
			System.out.println("Deleting operation " +
					"is not successful");
		}


	}

	private void changeName(StudentDAO studentDAO) {

		//Finding student
		Student student = studentDAO.findById(1);

		//Updating student
		student.setFirstName("Scooby");
		studentDAO.update(student);


	}

	private void getByAllastName(StudentDAO studentDAO) {


		//get a list of student by last name
		List<Student> students = studentDAO.findByLastName("Doe");

		//Printing the student
		for (Student temp: students
			 ) {

			System.out.println(temp);
		}
	}

	private void getALlStudent(StudentDAO studentDAO){

		//get a list of students,
		List<Student> students = studentDAO.getStudents();

		//print the all students
		 for (Student temoStudent: students) {
				System.out.println(temoStudent);
				}
	}

	private void createStudent(StudentDAO studentDAO) {

		//creat hte student object
		System.out.println("Creating new student object");
		Student tempStudent = new Student("Paul", "Doe","paul@gmail.com");



		//save the student object
		System.out.println("Saving the student");
		studentDAO.save(tempStudent);



		//isplay id of the saved stuent
		System.out.println("Saved student. Generate id: " + tempStudent.getId());
	}

	public void readStudent(StudentDAO studentDAO){

		System.out.println("Creating new student");
		Student temp = new Student("Duffy" , "Duck", "duffy@gmail.com");

		System.out.println("Saving the created object to Database");
		studentDAO.save(temp);

		System.out.println("Id of the saved student:" + temp.getId());

		Student myStudent = studentDAO.findById(temp.getId());

		System.out.println("Finding student with id:" + myStudent);


	}


}
