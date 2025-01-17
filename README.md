# JDBC
# JDBC - Java Database Connectivity

JDBC (Java Database Connectivity) is a mechanism to connect a Java program with a database. It acts as an API (Application Programming Interface) that is responsible for establishing the connection between two software systems.

## Prerequisites
- Add the external JAR file `mysql-connector` to your project.
- Configure the JAR file within the classpath of your project.

## Steps to Use JDBC

1. **Load and Register the Driver**  
   ```java
   Class.forName("com.mysql.cj.jdbc.Driver");
   
2. **Establish the connection between Java application and database**
   ```java
   Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)
   
3. **Create statement object**
   ```java
   Statement stmt = com.createStatement();
   PreparedStatement pstmt = com.prepareStatement();
   
4. **Send and execute Query**
   ```java
   stmt.executeQuery();
   - for modifying data
   int rowsAffected = stmt.executeUpdate(); // for insert, delete, and update
   - for retrieving data
   ResultSet rs = stmt.executeQuery(); //select
   
5. **Process data from result set**
   ```java
   while (rs.next()) {
    System.out.println(rs.getString("column_name"));
}
   
   
6. **Close the connection**
   ```java
   con.close();
