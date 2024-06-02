package org.marlisapee;

public class Scooter {
    public static int nextSerial = 1;

    private int serial;
    private int charge = 100;
    private String station;
    private boolean isBroken = false;
    private User user = null;

    public Scooter(String station) {
        this.station = station;
        this.charge = charge;
        this.isBroken = isBroken;
        this.serial = nextSerial++;
    }

    public User rent(User user) {
        if(this.charge > 20 && !this.isBroken){
            this.user = user;
            System.out.println(STR."Scooter #\{this.serial} rented to user successfully...");
            return user;
        } else {
            System.out.println("Scooter needs to be charged or repaired!");
            return null;
        }
    }

    public void dock(String station){
        this.user = null;
        this.station = station;
        System.out.println(STR."Scooter has been docked successfully at \{station}");
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public String getUser() {
        return user.getUsername();
    }

    public void setUser(User user) {
        this.user = user;
    }
}
