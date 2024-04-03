## Postman

![](Attachment/Pasted%20image%2020240312023316.png)

You chose respond type and URL u get respond from body section.

	- For simple REST testing for GET request
		- Web Browser and Postman are similar
	-However, for advanced REST testing: POST,PUT,etc
		-Postman has much better support
		-POSTing Json data, setting content type
		-Passing HTTP request headers,authentication etc.

![](Attachment/Pasted%20image%2020240312025012.png)

If we use on Postman :

![](Attachment/Pasted%20image%2020240312025030.png)


## Java JSON Data Binding

- Data binding is the process of converting JON data to a Java POJO

Java POJO is basically java object

- Spring uses the Jackson Project  behind the scenes 
- Jackson handles data binding  between JSON and Java POJO

By default, Jackson will call  appropriate getter/setter method.

![](Attachment/Pasted%20image%2020240312025602.png)



## Java Rest Boot POJO


![](Attachment/Pasted%20image%2020240312031411.png)

Hardcoded add some  student.

![](Attachment/Pasted%20image%2020240312031454.png)

Create an entity package and Student class.

![](Attachment/Pasted%20image%2020240312031528.png)

Same like database connection. As a result :

![](Attachment/Pasted%20image%2020240312031554.png)


## Getting Name by Id

![](Attachment/Pasted%20image%2020240402062740.png)

We will make a request for a specific student and it will return it. We using @PathVariable

 ![](Attachment/Pasted%20image%2020240402063249.png)

Note! = We use Postconstruct annotation because we want to work this method before the construct.

![](Attachment/Pasted%20image%2020240402063703.png)

It will match studentId with path variable.

## Exception Handling



But if we will use 9999 as a example

![](Attachment/Pasted%20image%2020240402064006.png)

We will take this error. For avoid this we need to handle this situation;

![](Attachment/Pasted%20image%2020240403034342.png)


Define exception handler method with @ExceptionHandler annotation. Exception handler will return a Response Entity. Response Entity is a wrapper for the HTTP response object. Response Entity provides fine=grained control to specify.

First of all, our Student Error Response class and our  field;

![](Attachment/Pasted%20image%2020240403035505.png)

After that create a Student Not Found Exception class and extend from Runtime Exception and use message cause with super.

![](Attachment/Pasted%20image%2020240403035652.png)

Then move to Rest Controller;

![](Attachment/Pasted%20image%2020240403035928.png)

in our get method this if statement check the student id if found any exception it will return an exception.

And create Response Entity ( it provides from Spring Boot) set the value of our error and ;
![](Attachment/Pasted%20image%2020240403040559.png)

For All cases;
![](Attachment/Pasted%20image%2020240403041534.png)


But in big project it hard to make all exception for all Rest controller for this reason we use global exception handler.


We just create name with StudentRestExceptionHandler and cut Exception from rest controller to here;
![](Attachment/Pasted%20image%2020240403042234.png)



## FULL CRUD DEMO

### JPA DAO



1.App properities

![](Attachment/Pasted%20image%2020240403044313.png)


And Create entity package and Employee entity
![](Attachment/Pasted%20image%2020240403045003.png)

![](Attachment/Pasted%20image%2020240403045016.png)
![](Attachment/Pasted%20image%2020240403045024.png)


After that create a new class EmployeeDAO  and implementation version

![](Attachment/Pasted%20image%2020240403045711.png)

![](Attachment/Pasted%20image%2020240403045719.png)


![](Attachment/Pasted%20image%2020240403045730.png)

And we can use Service for combining different entity information and combine them;
![](Attachment/Pasted%20image%2020240403051214.png)



![](Attachment/Pasted%20image%2020240403062314.png)


![](Attachment/Pasted%20image%2020240403063311.png)
Just add this and get Rest for FREE