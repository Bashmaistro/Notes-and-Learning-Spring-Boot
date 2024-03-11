### What is Hibernate?

- A framework for persisting / saving Java object in a database

![[Pasted image 20240229030732.png]]

### Benefits of Hibernate

- Hibernates handles all of the low -level SQL
- Minimizes the amount of JDBC code you have to develop
- Hibernate provides the Object=to=Relational Mapping(ORM)

### Object-TO-Relational Mapping (ORM)

- The developer defines mapping between Java class and database table
- 
![[Pasted image 20240229031119.png]]


### What is JPA?

- JAvakarta Persistence API (JPA) ...prviously known as Java Persistence API
	 - Starandard API for Object-to-Relational Mapping
	 - 

- Only a specification
	 - DDefines a set of intefaces
	 - Requires an implementation to be useable


![[Pasted image 20240229031958.png]]

![[Pasted image 20240229032115.png]]

![[Pasted image 20240229032153.png]]

![[Pasted image 20240229032631.png]]



### Using Database

#### Command Line Runner

The `CommandLineRunner` is an interface in Spring Boot. When a class implements this interface, Spring Boot will automatically run its `run` method after loading the application context. Usually, we use this `CommandLineRunner` to perform startup tasks like user or database initialization, seeding, or other startup activities.

Here’s a simplified sequence to run `CommandLineRunner.` in Spring Boot.

1. Application starts.
2. Spring Boot initializes and configures beans, properties, and the application context.
3. `CommandLineRunner` (or `ApplicationRunner`) methods are executed.
4. The application is now ready to serve connections or requests.

![[Pasted image 20240306043343.png]]

For Database connection:

![[Pasted image 20240306043700.png]]



Firstly create same name with table as a class:


![[Pasted image 20240306045425.png]]

And their column:

![[Pasted image 20240306045453.png]]

You need to make them private.

Make no-arg or arg constructor: 

![[Pasted image 20240306045546.png]]



## Create Object

![[Pasted image 20240306051211.png]]

We create Student Dao and StudentDaOImpl class.

In the Spring framework, DAO stands for Data Access Object. It is basically a design pattern used to facilitate interaction with the database.

DAO prevents developers from dealing with complex JDBC codes to write database operations. Instead, DAO classes provide a simple and consistent interface. This interface contains methods that perform basic database operations such as inserting, deleting, updating, and querying data.

Some benefits of Spring DAO are:

Code simplification: Improves code readability and maintainability by eliminating complex JDBC code.
Database independence: Can be easily adapted to work with different database systems.
Developer productivity: Allows developers to focus on business logic rather than database operations.
In the Spring framework, the @Repository annotation is often added to classes that represent the database access layer. This annotation tells the Spring framework that the class is a DAO and implements the corresponding configuration.

![[Pasted image 20240306051617.png]]

![[Pasted image 20240306051645.png]]


1. @Repository Annotation:

This annotation tells the Spring framework that this class is related to the database access layer and is a DAO.
It allows the Spring container to manage this class as a bean.
2. StudentDAOImpl Class:

This class implements the StudentDAO interface, that is, it implements the save method defined in the interface.
3. EntityManager Injection:

private EntityManager entityManager; A reference to the EntityManager is kept with the field.
The @Autowired annotation allows Spring to automatically inject an EntityManager instance into this class.
Injection is performed using the constructor method (StudentDAOImpl(EntityManager entityManager)).
4. @Transactional Annotation:

This annotation, located above the save method, ensures that database operations are carried out within the scope of a transaction.
This way, if an error occurs, the entire transaction can be rolled back.
5. Implementation of the save Method:

entityManager.persist(thestudent); It permanently saves the Student object given by the call to the database.
This allows the data to be added to the database.


![[Pasted image 20240306052635.png]]



**. `@Bean` Annotation:**

- This annotation marks the `commandLineRunner` method as a Spring bean.
- Spring will manage the lifecycle of this bean and make it available for dependency injection.

**2. `CommandLineRunner` Implementation:**

- The method takes a `StudentDAO` object as an argument, allowing it to interact with the student data.
- It returns a `CommandLineRunner` object, which is a functional interface with a single abstract method `run()`.

**3. Lambda Expression:**

- The method uses a lambda expression to define the logic for the `run()` method.
- The lambda expression takes a single argument, `runner`, which is a reference to the `CommandLineRunner` instance.
- Inside the lambda, the `createStudent` method is called, passing the injected `studentDAO` as an argument.

**4. `createStudent` Method:**

- This method is responsible for creating a new student object, saving it to the database, and displaying the generated ID.
- It creates a new `Student` object with sample data (name, email, etc.).
- It calls the `save` method from the injected `StudentDAO` to persist the student object in the database.
- Finally, it retrieves the ID of the saved student object and prints it to the console.


## Read Object

![[Pasted image 20240309014107.png]]

Firstly implement a method to Student DAO interface class.

![[Pasted image 20240309014243.png]]

We telling the method to which object looking for and which key.

If it couldn't find the object, will be return null object.

![[Pasted image 20240309014420.png]]


## Update Object

We use JPA query language for retrieving objects, similar in concept to SQL.However, JPQL is based on entity name and entity fields.

![[Pasted image 20240309015102.png]]

This code for retrieving all students from students table. 

**Note: this is NOT the name of the datebase table. All JPQL syntax is based on entity name and entity  fields**


![[Pasted image 20240309015533.png]]

This code retrieving all student which last name are doe.

![[Pasted image 20240309015645.png]]

This code retrieving all student whose email ends in 'luv2code.com'

![[Pasted image 20240309020052.png]]

We can use named paramaters. In general, named parameters make your JPQL queries more readable, secure and performant.

![[Pasted image 20240309020721.png]]

As like early create method in Student Dao Interface.

![[Pasted image 20240309020810.png]]

Implement the method and return query result as a List.

![[Pasted image 20240309021226.png]]
 

We can even take names by Ordered like that:

![[Pasted image 20240309021425.png]]

![[Pasted image 20240309021513.png]]

We can easily implement a method for finding student by last name

![[Pasted image 20240309022410.png]]
