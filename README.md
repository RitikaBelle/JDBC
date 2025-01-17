# JDBC
JDBC - JAVA DATABASE CONNECTIVITY
It is a mechanism to connect java program with database also considered as an API(Application Programming Interface) which is responsible for establishing the connection between two softwares.

For this JDBC we have to add external jar to the project which MYSQL-CONNECTOR JAR file. 
To add this external jar to the project we have to build the path within classpath of project.

#Steps to build JDBC
1)Load and Register the Driver
   Class.forName("com.mysql,cj.jdbc.Driver)
2)Establish the connection between Java application and database
   Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)
3)Create statement object
   Statement stmt = com.createStatement();
   PreparedStatement pstmt = com.prepareStatement();
4)Send and execute Query
   stmt.executeQuery();
   int rowsAffected = stmt.executeUpdate(); // for insert, delete, and update
5)Process data from result set
   ResultSet rs = stmt.executeQuery(); //select
6)Close the connection
   con.close();
