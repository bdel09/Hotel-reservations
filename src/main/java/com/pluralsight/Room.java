package com.pluralsight;

public class Room {
    int NumberOfBeds;
    double Price;
    boolean Occupied, Dirty, Availble;

    public Room(int NumberOfBeds, double Price, boolean Occupied, boolean Dirty, boolean Availble) {
        NumberOfBeds = this.NumberOfBeds;
        Price = this.Price;
        Occupied = this.Occupied;
        Dirty = this.Dirty;
        Availble = this.Availble;

    }

    //Creating the getters
    public int getNumberOfBeds(){
        return NumberOfBeds;
    }
    public double getPrice(){
        return Price;
    }
    public boolean isOccupied() {
        return Occupied;}
    public boolean isDirty(){
        return Dirty;}
    //isAvilable is derived because it's value depends on in-built parameters falsity
    public boolean isAvailble() {
        return Dirty && Occupied;
    }



}





