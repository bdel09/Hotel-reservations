package com.pluralsight;

public class Reservation {
    //Initialize backing variables i.e. variables that are private
    private String roomType;
    private boolean weekend;
    public String King, Double;
    private int NumberofNights;
    double Price;
    double ReservationTotal = Price * NumberofNights;

    //Use construtcor to set initial values
    public Reservation(String roomType, boolean weekend, int NumberofNights, double Price, double ReservationTotal){
        roomType = "King";
        weekend = false;
        NumberofNights = 0;
        Price = 0;
        ReservationTotal = 0;
    }

    public String getroomType() {
        try {
            if (this.roomType.equals("King")) {
                //Say the price per night is $139.00
                System.out.print("Cost per night is:" + 139.00);
                this.roomType = "King";
            } else if (this.roomType.equals("Double")) {
                System.out.print("Cost per night is:" + 124.00);
                this.roomType = "Double";

            } else {
                System.out.print("Please enter King or Double.");
            }
        } catch (Exception e){
            System.out.println("Exception caught. See error message above.");
        }
        return this.roomType;
    }




    public void setroomType(String roomType) {
        this.roomType = roomType;
    }
    public double getPrice() {
        return Price;

    }
    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
    //get and set number of nights

    public int getNumberofNights() {
        return NumberofNights;
    }

    public void setNumberofNights(int numberofNights) {
        NumberofNights = numberofNights;
    }

    //get reservation total

    public double getReservationTotal() {
        return ReservationTotal;
    }
    //Are they staying over the weekend?


    public boolean isWeekend() {
        return weekend;
    }
}




