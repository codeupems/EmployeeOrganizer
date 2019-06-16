package dao;

import com.mysql.jdbc.Driver;
import mysql.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeesDao implements Employees {
    /*
     *
     * Create a class named dao.EmployeesDao that implements the Ads interface


     * This class should have a private instance property named connection of type Connection that is
     * initialized in the constructor. Define your constructor so that it accepts an instance of
     * your Config class so that it can obtain the database credentials.
     * Implement the methods in the Ads interface
     * Your methods should retrieve ads from the database and insert new ads into the database
     * The connection object will be created just once, in this class' constructor, and the individual
     * methods that query the database should use the connection object to create statements.
     */
    private Config config = new Config();
    private Connection connection;

    public EmployeesDao() {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUserName(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public List<Employee> all(int perPage, int pageNum){
        List<Employee> employeesList = new ArrayList<Employee>();
        System.out.println("perpage starts at " + perPage);
        try {
            Statement stmt = connection.createStatement();
            //perPage-=2;
            System.out.println("perpage before query string = " + perPage);

            String query = String.format("SELECT * FROM employees LIMIT %d OFFSET %d", perPage ,
                    (pageNum * perPage)-perPage);
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Employee emp = new Employee();
                emp.setFirst_name(rs.getString("first_name"));
                emp.setLast_name(rs.getString("last_name"));
                emp.setEmp_no(rs.getInt("emp_no"));
                emp.setGender(rs.getString("gender"));
                emp.setBirth_date(rs.getDate("birth_date"));
                emp.setHire_date(rs.getDate("hire_date"));

                employeesList.add(emp);

            }
        }catch(SQLException e){
            e.printStackTrace();
        }


        return employeesList;
    }

    @Override
    public long insert(Employee emp) {
        return 0;
    }
}
