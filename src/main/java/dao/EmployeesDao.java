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


    public static void main(String[] args) {
        DaoFactory.empListDao().search("Bezalel");
    }

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

    public List<Employee> all(int perPage, int pageNum) {
        List<Employee> employeesList = new ArrayList<Employee>();
        System.out.println("perpage starts at " + perPage);
        try {
            Statement stmt = connection.createStatement();
            //perPage-=2;
            System.out.println("perpage before query string = " + perPage);

            String query = String.format("SELECT * FROM employees limit %d offset %d", perPage,
                    (pageNum * perPage) - perPage);
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setGender(rs.getString("gender"));
                emp.setFirst_name(rs.getString("first_name"));
                emp.setLast_name(rs.getString("last_name"));
                emp.setBirth_date(rs.getDate("birth_date"));
                emp.setHire_date(rs.getDate("hire_date"));

                employeesList.add(emp);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return employeesList;
    }

    public List<Employee> all(){
        List<Employee> employeesList = new ArrayList<Employee>();
//        System.out.println("perpage starts at " + perPage);
        try {
            Statement stmt = connection.createStatement();
            //perPage-=2;
//            System.out.println("perpage before query string = " + perPage);

            String query = String.format("SELECT * FROM employees ");
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Employee emp = new Employee();
                emp.setFirst_name(rs.getString("first_name"));
                emp.setLast_name(rs.getString("last_name"));
                emp.setId(rs.getInt("id"));
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


    public List<Employee> search(String searchQuery) {
        System.out.println("search started");
        List<Employee> employeesList = new ArrayList<Employee>();
        String sQFirst = "";
        String sQSecond = "";
        String[] spltQuery = searchQuery.split(" ");
        if (spltQuery.length > 1) {
            sQFirst = spltQuery[0];
            sQSecond = spltQuery[1];
        } else {
            sQFirst = spltQuery[0];
            sQSecond = "";
        }
        String formatQuery =
                "SELECT * FROM employees where first_name like '%" + sQFirst + "%' and " +
                        "last_name like '%" + sQSecond + "%'";

        try {

            System.out.println(formatQuery);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(formatQuery);
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setFirst_name(rs.getString("first_name"));
                System.out.println(emp.getFirst_name());
                emp.setLast_name(rs.getString("last_name"));
                System.out.println(emp.getLast_name());
                emp.setId(rs.getInt("id"));
                System.out.println(emp.getId());
                employeesList.add(emp);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeesList;
    }

    @Override
    public long insert(Employee emp) {
        String query = "INSERT INTO ems_db.employees( gender, first_name, last_name, birth_date, hire_date, salary," +
                " bio, goals, dept_id, job_id) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, emp.getGender());
            stmt.setString(2, emp.getFirst_name());
            stmt.setString(3, emp.getLast_name());
            stmt.setDate(4, (Date) emp.getBirth_date());
            stmt.setDate(5, (Date) emp.getHire_date());
            stmt.setDouble(6, emp.getSalary());
            stmt.setString(7, emp.getBio());
            stmt.setString(8, emp.getGoals());
            stmt.setInt(9, emp.getDept_id());
            stmt.setInt(10, emp.getJob_id());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating new employee", e);
        }
    }
}
