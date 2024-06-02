package org.marlisapee;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ScooterApp app = new ScooterApp();

        // create new user
        var user = app.registerUser("marlisajp", "password", (short)29);
        var user2 = app.registerUser("janedoe", "password", (short)30);

        // login new user
        app.loginUser(user.getUsername(), user.getPassword());
        app.loginUser(user2.getUsername(), user2.getPassword());

        // create new scooter
        var scooter = app.createScooter("Brooklyn");
        var scooter2 = app.createScooter("Queens");

        // rent new scooter to user
        scooter.rent(user);
        scooter2.rent(user2);

        app.logoutUser(user);

        app.print();
    }
}