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
