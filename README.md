<h1>STS (Simple Taxi Service)</h1>

<img src="https://lubimoetaxi.com.ua/wp-content/uploads/2019/02/lyubimoe-taksi-kharkov-kropivnitskiy-kamenskoe-zaporozhye-img-001.png" alt="">
<hr>

##What is the purpose of this project?
The main purpose of this project is to implement a Simple Taxi Service (STS).

This simple app allows you to manage your taxi fleet by using its functionality, which includes the following:
- creating a car
- creating a manufacturer
- displaying all the drivers
- adding driver to car
- displaying all the cars assigned to the driver
- removing driver from car, etc.

This app implements an N-tier architecture, drivers are also able to authenticate themselves in the system by login and password.
<hr>

## How to launch this app:
1. To run the project on your PC, clone it into your local directory and then open it in an IDE.
2. Install MySQL and MySQL Workbench, use the script from _resources/init_db.sql_ to configure your MySQL.
3. Configure connection to your database by editing _src/main/java/taxi/util/ConnectionUtil.java_ file: <br>
   **YOUR DB URL:** _jdbc:mysql://localhost:3306/<b>database_name</b>?useLegacyDatetimeCode=false&serverTimezone=UTC_ <br> (if you created a DB using the script from _init_db_ file, your <b>database_name</b> would be <b>taxi</b>)  <br>
   **YOUR DB USERNAME:** MySQL username <br>
   **YOUR DB PASSWORD:** MySQL password <br>
   **YOUR JDBC DRIVER:** _com.mysql.cj.jdbc.Driver_ or any other suitable driver <br>
4. Configure TomCat Local server (_Add New Configuration_ -> _TomCat Server_ -> _Local_ -> _Fix_ -> _taxi-service:war exploded_ -> set _Application context_ to "/" -> _OK_).
5. Run your project.
<hr>

## Technologies used
- Apache Tomcat (version 8.5.69)
- MySQL
- JDBC
- Servlet
- JSP
- JSTL
- HTML, CSS
- Logger (Log4j2)
- Maven
- Custom injector
  <hr>