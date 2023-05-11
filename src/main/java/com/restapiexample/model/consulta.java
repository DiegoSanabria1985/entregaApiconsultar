package com.restapiexample.model;

public class consulta {

    String status;
    String id;
    String employee_name;
    String employee_salary;
    String employee_age;

    public consulta(String status, String id, String employee_name, String employee_salary, String employee_age, String profile_image) {
        this.status = status;
        this.id = id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
        this.employee_age = employee_age;
        this.profile_image = profile_image;
    }

    String profile_image;

    public String getStatus() {
        return status;
    }

    public String getId() {
        return id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public String getEmployee_salary() {
        return employee_salary;
    }

    public String getEmployee_age() {
        return employee_age;
    }

    public String getProfile_image() {
        return profile_image;
    }
}
