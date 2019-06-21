package dao;

import java.util.*;

public class Employee {
    private int id;
    private Date birth_date;
    private String first_name;
    private String last_name;
    private String gender;
    private Date hire_date;

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

    // getters

    public int getId() {
        return id;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getGender() {
        return gender;
    }

    public Date getHire_date() {
        return hire_date;
    }

    // setters


    public void setId(int id) {
        this.id = id;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }
}

