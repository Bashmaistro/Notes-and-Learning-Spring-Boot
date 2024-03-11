

## 0.Basic of Spring

- Spring Initializ created a Maven project for us http://start.spring.io

- We can choose dependicies for our project 

- "*application.properties*" files allows to make choose about our server properties 
```
- @Value("${coach.name}")
- private String coachName
```

**Let's break down the code:**

- `@Value("${coach.name}")`: This annotation indicates that the value of the `coachName` field should be injected from the `coach.name` application property.
- `private String coachName`: This line declares a field named `coachName`. The field's access modifier is set to `private`, which means it can only be accessed within this class.
- `String`: This specifies the data type of the `coachName` field. In this case, the field will be a string.

**Here's an example of how this code works:**

Let's say your application property file (`application.properties`) is defined as follows:

```
coach.name=John Doe
```

In this case, the `coachName` field will be assigned the value "John Doe". Whenever your code accesses this field, it will retrieve the string "John Doe".

**Here are some benefits of using this code:**

- **Reduces code duplication:** If you need to use your application property in multiple places, you can define it in a single place and use it with the `@Value` annotation instead of repeating it everywhere.
- **Makes your code more readable:** Explicitly stating the names of application properties in your code makes it easier to understand what your code is doing.
- **Facilitates changes:** If you need to make a change to your application property, you only need to make it in one place. All references in your code will be automatically updated.









## 1.Spring Boot Starter

In Spring Boot, a **starter** is a pre-configured set of dependencies that simplify and expedite the development process. They act like building blocks, providing essential libraries and functionalities without requiring you to manually search for and add individual dependencies.

Here's a breakdown of what Spring Boot starters offer:

- **Reduced Boilerplate Code:** Starter dependencies bundle together commonly used libraries, eliminating the need to manually configure and add them to your project. This saves time and reduces boilerplate code in your application.
- **Simplified Dependency Management:** Starters manage dependencies and their versions, ensuring compatibility and avoiding conflicts. They handle potential conflicts between different library versions, so you don't have to worry about them.
- **Faster Development:** By pre-configuring dependencies, starters allow you to focus on writing your application logic instead of spending time on setting up the environment. This can significantly accelerate your development process.
```
<dependencies> 
	 <dependency> 
		<groupId>org.springframework.boot</groupId> 
		<artifactId>spring-boot-starter-web</artifactId> 
	</dependency> 
	<dependency> 
	    <groupId>org.springframework.boot</groupId> 
		<artifactId>spring-boot-starter-test</artifactId> 
		<scope>test</scope> 
	</dependency> 
</dependencies>
```
 
 It contains spring-web ,spring-webmvc,hibernate,json,tomcat... and there is a lot  here is the list


|                                        |                                                                                                                                                 |
| -------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| Name                                   | Description                                                                                                                                     |
| spring-boot-starter-thymeleaf          | It is used to build MVC web applications using Thymeleaf views.                                                                                 |
| spring-boot-starter-data-couchbase     | It is used for the Couchbase document-oriented database and Spring Data Couchbase.                                                              |
| spring-boot-starter-artemis            | It is used for JMS messaging using Apache Artemis.                                                                                              |
| spring-boot-starter-web-services       | It is used for Spring Web Services.                                                                                                             |
| spring-boot-starter-mail               | It is used to support Java Mail and Spring Framework's email sending.                                                                           |
| spring-boot-starter-data-redis         | It is used for Redis key-value data store with Spring Data Redis and the Jedis client.                                                          |
| spring-boot-starter-web                | It is used for building the web application, including RESTful applications using Spring MVC. It uses Tomcat as the default embedded container. |
| spring-boot-starter-data-gemfire       | It is used to GemFire distributed data store and Spring Data GemFire.                                                                           |
| spring-boot-starter-activemq           | It is used in JMS messaging using Apache ActiveMQ.                                                                                              |
| spring-boot-starter-data-elasticsearch | It is used in Elasticsearch search and analytics engine and Spring Data Elasticsearch.                                                          |
| spring-boot-starter-integration        | It is used for Spring Integration.                                                                                                              |
| spring-boot-starter-test               | It is used to test Spring Boot applications with libraries, including JUnit, Hamcrest, and Mockito.                                             |
| spring-boot-starter-jdbc               | It is used for JDBC with the Tomcat JDBC connection pool.                                                                                       |
| spring-boot-starter-mobile             | It is used for building web applications using Spring Mobile.                                                                                   |
| spring-boot-starter-validation         | It is used for Java Bean Validation with Hibernate Validator.                                                                                   |
| spring-boot-starter-hateoas            | It is used to build a hypermedia-based RESTful web application with Spring MVC and Spring HATEOAS.                                              |
| spring-boot-starter-jersey             | It is used to build RESTful web applications using JAX-RS and Jersey. An alternative to spring-boot-starter-web.                                |
| spring-boot-starter-data-neo4j         | It is used for the Neo4j graph database and Spring Data Neo4j.                                                                                  |
| spring-boot-starter-data-ldap          | It is used for Spring Data LDAP.                                                                                                                |
| spring-boot-starter-websocket          | It is used for building the WebSocket applications. It uses Spring Framework's WebSocket support.                                               |
| spring-boot-starter-aop                | It is used for aspect-oriented programming with Spring AOP and AspectJ.                                                                         |
| spring-boot-starter-amqp               | It is used for Spring AMQP and Rabbit MQ.                                                                                                       |
| spring-boot-starter-data-cassandra     | It is used for Cassandra distributed database and Spring Data Cassandra.                                                                        |
| spring-boot-starter-social-facebook    | It is used for Spring Social Facebook.                                                                                                          |
| spring-boot-starter-jta-atomikos       | It is used for JTA transactions using Atomikos.                                                                                                 |
| spring-boot-starter-security           | It is used for Spring Security.                                                                                                                 |
| spring-boot-starter-mustache           | It is used for building MVC web applications using Mustache views.                                                                              |
| spring-boot-starter-data-jpa           | It is used for Spring Data JPA with Hibernate.                                                                                                  |
| spring-boot-starter                    | It is used for core starter, including auto-configuration support, logging, and YAML.                                                           |
| spring-boot-starter-groovy-templates   | It is used for building MVC web applications using Groovy Template views.                                                                       |
| spring-boot-starter-freemarker         | It is used for building MVC web applications using FreeMarker views.                                                                            |
| spring-boot-starter-batch              | It is used for Spring Batch.                                                                                                                    |
| spring-boot-starter-social-linkedin    | It is used for Spring Social LinkedIn.                                                                                                          |
| spring-boot-starter-cache              | It is used for Spring Framework's caching support.                                                                                              |
| spring-boot-starter-data-solr          | It is used for the Apache Solr search platform with Spring Data Solr.                                                                           |
| spring-boot-starter-data-mongodb       | It is used for MongoDB document-oriented database and Spring Data MongoDB.                                                                      |
| spring-boot-starter-jooq               | It is used for jOOQ to access SQL databases. An alternative to spring-boot-starter-data-jpa or spring-boot-starter-jdbc.                        |
| spring-boot-starter-jta-narayana       | It is used for Spring Boot Narayana JTA Starter.                                                                                                |
| spring-boot-starter-cloud-connectors   | It is used for Spring Cloud Connectors that simplifies connecting to services in cloud platforms like Cloud Foundry and Heroku.                 |
| spring-boot-starter-jta-bitronix       | It is used for JTA transactions using Bitronix.                                                                                                 |
| spring-boot-starter-social-twitter     | It is used for Spring Social Twitter.                                                                                                           |
| spring-boot-starter-data-rest          | It is used for exposing Spring Data repositories over REST using Spring Data REST.                                                              |

## **2.Rest Controller**


```
@RestController
public class FunRestController {

// expose "/" that returns "Hello World"

@GetMapping("/")
public String sayHello(){
 return "Hello World!";
}
}
```


This code defines a controller class for a RESTful API in a Spring Boot application. It works as follows:

- **`@RestController` annotation:** This annotation specifies that the class is a Rest Controller. This means that the class can handle HTTP requests and return data in formats like JSON or XML.
- **`public class FunRestController`:** This line defines a class named `FunRestController`. This class contains the functionality of the controller class.
- **`@GetMapping("/")`:** This annotation specifies that the `sayHello` method will respond to an HTTP GET request. It also specifies the request path as "/". This means that the `sayHello` method will be called when the user sends a GET request to the root URL (`http://localhost:8080/`).
- **`public String sayHello(){`:** This line defines a method named `sayHello` with a return type of `String`. This method is called when the HTTP request is processed.
- **`return "Hello World!";`:** This line returns the text "Hello World!". This text is sent as a response to the HTTP request.

In summary, this code creates a simple RESTful API that returns the message "Hello World!" when a user sends a GET request to the root URL.





## 3.Actuator

Spring Boot Actuator: Monitoring and Management Made Easier

**Spring Boot Actuator** is a set of built-in features within Spring Boot that provide **monitoring and management** capabilities for your applications. It allows you to easily:

- **Monitor** the health and performance of your application, including information about CPU usage, memory consumption, and thread health.
- **Manage** your application by exposing endpoints you can use to perform various actions, such as:
    - Checking application health
    - Viewing environment information
    - Getting thread dumps
    - Shutting down the application

**Benefits of Using Spring Boot Actuator:**

- **Reduced Boilerplate Code:** Actuator provides pre-built features, saving you time and effort compared to implementing custom solutions from scratch.
- **Improved Monitoring and Management:** It simplifies monitoring application health and performance and allows you to perform management tasks easily.
- **Simplified Integration:** Actuator integrates seamlessly with Spring Boot applications, requiring minimal configuration.

**How Actuator Works:**

1. **Endpoint Discovery:** Spring Boot Actuator exposes various HTTP endpoints that can be accessed to access information and perform actions. These endpoints are typically available under the `/actuator` path.
2. **Security:** Actuator endpoints are secured by default, requiring proper authentication and authorization to access them. You can configure security settings to control access to specific endpoints.
3. **Customization:** While Actuator provides pre-built functionality, you can also customize it to expose additional information or perform specific actions through custom endpoints.

**Commonly Used Actuator Endpoints:**

- **`/health`:** Provides information about the overall health of your application.
- **`/info`:** Exposes general information about your application, such as environment details and build information.
- **`/beans`:** Lists all Spring beans managed by the application context.
- **`/metrics`:** Provides various metrics about the application, such as memory usage and thread pool information.

**Overall, Spring Boot Actuator is a valuable tool for developers and operations teams by simplifying application monitoring, management, and troubleshooting.**



## 4.Bean Scopes
 
 
 - Scope refers to the lifecycle of a bean 
 - How long does the bean live ?
 - How many instances are created ?
 - How is the bean shared ?

Default Scopes is Singelton. What is the singelton?

- Spring Container creates only one instance of the bean,by default
- It is cached in memory.
- All dependency injections for the bean will reference for the bean.


![[Pasted image 20240229015446.png]]

In singelton same obejct will be used .

![[Pasted image 20240229015650.png]]

Every time it will be created new beans refers diffrent area in the memory.

![[Pasted image 20240229015753.png]]

If we use Singelton scope it will be same bu if we are use Prototype, it will be diffrent because they are refers diffrent area in the memory.



## 5.Bean Lifecycle

![[Pasted image 20240229021410.png]]

- You can add custom code during **bean initialization**
    - Calling custom bussiness logic methods
    - Setting up handles to resources ( db,sockets,file,etc)
- You can add custom code during bean destructoin
	- Calling custom bussiniess logic method
	- Clean up handles to resources (db, sockets, files etc)


![[Pasted image 20240229021750.png]]

  
```
 @PostConstruct  
public void doMyStartupStuff(){  
    System.out.println("Doing startup stuff");  
}  
//destroy method  
@PreDestroy  
public void doMyCleanupStuff(){  
    System.out.println("Doing Cleanup stuff");  
}
```


## 6.Java Config Bean

#### **Use case for @Bean**

- Make an existing thrid-party class available to Spring Framework
- You may not have access to the sourcce code of third-party class
- however, you would like to use the third-party class as a Spring bean




