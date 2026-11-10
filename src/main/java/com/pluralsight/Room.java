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
        return Dirty || Occupied;
    }
//part 2: modify room class to add checkin(), checkout(), and cleanRoom() methods
//Describing the checkin; marked occupied and dirty
    public void checkin() {
        this.Availble = false;}
    public void checkout() {
        this.Availble = true;
        //once a guest checks out of the room,
        // it must be cleaned by a housekeeper first
    }
    public void cleanRoom() {
        if (Dirty && !Occupied) {
            System.out.println("Time to Clean!");
            this.Availble = true;
            System.out.println("Room is now availble!");
        } else {
            this.Availble = false;
            System.out.println("Unavailble for cleaning and for checking in new guest.");
        }
    }


}





