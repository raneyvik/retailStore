This project is a simple spring boot application applying Retail Store Discounts which are provided below:

1.If the user is an employee of the store, he gets a 30% discount
2.If the user is an affiliate of the store, he gets a 10% discount
3.If the user has been a customer for over 2 years, he gets a 5% discount.
4.For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45 as a discount).
5.The percentage based discounts do not apply on groceries.
6.A user can get only one of the percentage based discounts on a bill.

Requirements
-----------------
For building and running the application you need:
JDK 1.8
Maven 3

Running the application locally
-----------------------------------
There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the RetailSiteApplication class from your IDE.

Alternatively you can use the Spring Boot Maven plugin like so:

mvn spring-boot:run

Build an executable JAR
----------------------------
You can run the application from the command line using:

mvn spring-boot:run
Or you can build a single executable JAR file that contains all the necessary dependencies, classes, and resources with:

mvn clean package
Then you can run the JAR file with:

java -jar target/*.jar
