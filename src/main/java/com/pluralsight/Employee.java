package com.pluralsight;
import java.time.LocalTime;

public class Employee {
    //Include variables: hoursworked, name, employeeID, Department, payrate
    private String name, employeeId, department;
    private int hoursWorked;
    private double payRate;
    private double TotalPay = payRate * hoursWorked;
    private float OvertimeHours;
    private float regularHours = hoursWorked - OvertimeHours;
    //Sdding new time varaible
    int time;

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
        return regularHours;}
    //Modify the employee class to add punchin and punchout methods
    //Re: punchiin, with each tme we punch in, we track their start time
    //So with each declaration of a certain varaible(s): (name , employeeid, department)
    //we record their start time (time; a new inetger variable) possibly returning their start time via the punchin method
    //
    public int punchIn(int time) {

        if (time < 0 || time > 24) {
            System.out.print("Please input a time within 0 and 24 hrs.");
            //Added to the regularhourrs
        }
        return time;
    }


    public String punchIn() {
        LocalTime ahora = LocalTime.now();
        int hrs = ahora.getHour();
        int min = ahora.getMinute();
        String HM = "hrs" + "min";
         return HM;}
    public int punchOut(int time) {
        if (time < 0 || time > 24) {
            System.out.println("Please input a time within 0 and 24 hrs.");
            System.out.println("Be sure that your punchout time does noot conflict with the time of your arrival.");
            time = (int) (time + getRegularHours());}
        return time;}
    public String punchOut() {
        LocalTime ahora = LocalTime.now();
        int hrs = ahora.getHour();
        int min = ahora.getMinute();
        String HM = "hrs" + "min";
        return HM;}




    //Create overloaded methods for punchIn() and punchOut()
    //By overlaoded methods: imagine a function for which the co-domain consists of a name, the domain methods.
    //the cardinality of the domain vastly exceeds the co-domain
    //condition: ensure that their params lists differ
    //Applications: brevity ig
    //Here, our overloaded methods can't incorporate paramerters but are able to determine the hour and minute
    //So, the LocalDateTime is needed

}







