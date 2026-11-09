package com.pluralsight;

public class Employee {
    //Include variables: hoursworked, name, employeeID, Department, payrate
    private String name, employeeId, department;
    private int hoursWorked;
    private double payRate;
    private double TotalPay = payRate * hoursWorked;
    private float OvertimeHours;
    private float regularHours = hoursWorked - OvertimeHours;

    //Create the employee class to store and calculate this info
    public Employee(String name, int hoursWorked, String employeeId, String department, double payRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.employeeId = employeeId;
        this.department = department;
        this.payRate = payRate;
    }

    //Derived getters
    public float getHoursWorked() {
        return this.hoursWorked;
    }

    public double getTotalPay() {
        this.TotalPay = this.payRate * this.hoursWorked;
        return this.TotalPay;
    }

    public float getOvertimeHours() {
        if (this.hoursWorked > 40) {
            float OvertimeHours = this.hoursWorked - 40;
            System.out.println("Overtime Hours worked: " + OvertimeHours);
            System.out.println("Total Pay is: " + this.TotalPay);
        } else {
            System.out.println("No overtime.");
        }
        return OvertimeHours;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public float getRegularHours() {
        return regularHours;
    }

    //Inlcude derived getters:
    //getTotalPay()
    public float getregularHours() {
        return regularHours;

    }
}







