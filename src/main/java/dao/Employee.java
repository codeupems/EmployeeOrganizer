package dao;

import java.util.*;

public class Employee {
    private int id;
    private String gender;
    private String first_name;
    private String last_name;
    private Date birth_date;
    private Date hire_date;
    private double salary;
    private String bio;
    private String goals;
    private int dept_id;
    private int job_id;

    public Employee(int id, String gender, String first_name, String last_name, Date birth_date, Date hire_date,
                    double salary, String bio, String goals, int dept_id, int job_id) {
        this.id = id;
        this.gender = gender;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.hire_date = hire_date;
        this.salary = salary;
        this.bio = bio;
        this.goals = goals;
        this.dept_id = dept_id;
        this.job_id = job_id;
    }
    public Employee( String gender, String first_name, String last_name, Date birth_date, Date hire_date,
                    double salary, String bio, String goals, int dept_id, int job_id) {
        this.gender = gender;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.hire_date = hire_date;
        this.salary = salary;
        this.bio = bio;
        this.goals = goals;
        this.dept_id = dept_id;
        this.job_id = job_id;
    }

    public Employee() {

    }

    public Employee( Date birth_date, String first_name, String last_name, String gender,
                      Date hire_date) {

        this.birth_date = birth_date;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.hire_date = hire_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }
}

