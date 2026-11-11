package com.pluralsight;
import java.time.LocalDateTime;

public class Employee {
    //Include variables: hoursworked, name, employeeID, Department, payrate
    private String name, employeeId, department;
    private int hoursWorked;//Describes weekly hours
    private double payRate;
    private double TotalPay = payRate * hoursWorked;
    private int OvertimeHours;
    private int regularHours = 0;
    //Sdding new time varaible
    private int time_out;
    private int time_in;

    //Create the employee class to store and calculate this info
    public Employee(String name, int hoursWorked, String employeeId, String department, double payRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.employeeId = employeeId;
        this.department = department;
        this.payRate = payRate;
    }

    //Derived getters
    public int getHoursWorked() {
        return this.hoursWorked;
    }
    public double getTotalPay() {
        return TotalPay;}
    public int getOvertimeHours() {
        if (this.hoursWorked > 40) {
            int OvertimeHours = this.hoursWorked - 40;
            return OvertimeHours;
        }
        return 0; //like how we terminate in cpp
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

    public double getpayRate() {
        return payRate;
    }
    public float getregularHours() {
        return regularHours;
    }


    //Inlcude derived getters:
    //getTotalPay()
    //Modify the employee class to add punchin and punchout methods
    //Re: punchiin, with each tme we punch in, we track their start time
    //So with each declaration of a certain varaible(s): (name , employeeid, department)
    //we record their start time (time; a new inetger variable) possibly returning their start time via the punchin method
    //
    public int punchIn(int time_in) {
        if (time_in < 0 || time_in > 24) {
            System.out.print("Please input a time within 0 and 24 hrs.");
            //Added to the regularhourrs
            throw new IllegalArgumentException("Try Again!");
        }
        this.time_in = time_in;
        return this.time_in;
    }


    public LocalDateTime punchIn() {
        //store the punchi-in timestamp as an instance
        return LocalDateTime.now();
    }
    //maybe make this a setter?

    public int punchOut(int time_out) {
        if (time_out < 0 || time_out > 24) {
            System.out.println("Please input a time_out within 0 and 24 hrs.");
            System.out.println("Be sure that your punchout time_out does noot conflict with the time_out of your arrival.");
            throw new IllegalArgumentException("Input anew!");
        }
            time_out = this.time_out;
        this.hoursWorked = this.time_out - this.time_in;
        return this.hoursWorked;}

    public LocalDateTime punchOut() {
        LocalDateTime luego = LocalDateTime.now();
        if (luego.isBefore(punchIn())) {
            throw new IllegalArgumentException("Error! Time of clock-out is behind clock in!");
        }
        //compare time and date:
        return luego;
    }





    //Create overloaded methods for punchIn() and punchOut()
    //By overlaoded methods: imagine a function for which the co-domain consists of a name, the domain methods.
    //the cardinality of the domain vastly exceeds the co-domain
    //condition: ensure that their params lists differ
    //Applications: brevity ig
    //Here, our overloaded methods can't incorporate paramerters but are able to determine the hour and minute
    //So, the LocalDateTime is needed

}







