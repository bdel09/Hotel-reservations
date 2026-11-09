package com.pluralsight;

public class Main {
    //Put in all the getters and setters
    public static void main(String[] args) {
        Room room1 = new Room(2,4026,true, false, true );
        System.out.println("Room Information:");
        //test the getters; they're custom methods of room1
        System.out.println(room1.getNumberOfBeds());
        System.out.println(room1.getPrice());
        System.out.println(room1.isAvailble());
        System.out.println(room1.isDirty());
        System.out.println(room1.isOccupied());
        //The Rseervation?
        Reservation reservation1 = new Reservation("King", false,5,50, 250);
        System.out.println(reservation1.getroomType());
        System.out.println(reservation1.getNumberofNights());
        System.out.println(reservation1.isWeekend());
        System.out.println(reservation1.getReservationTotal());
        //The Employee?
        Employee Employee1 = new Employee("Gohan", 80,"405123678","IT", 30.00);
        System.out.println(Employee1.getName());
        System.out.println(Employee1.getDepartment());
        System.out.println(Employee1.getEmployeeId());
        System.out.println(Employee1.getHoursWorked());
        System.out.println(Employee1.getTotalPay());
    }
}
