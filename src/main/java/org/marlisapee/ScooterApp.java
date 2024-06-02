package org.marlisapee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class ScooterApp {
    private List<User> registeredUsers = new ArrayList<>();
    private List<Scooter> scooters = new ArrayList<>();

    public Optional<Scooter> getScooter(int serial){
       int index = IntStream.range(0, scooters.size())
               .filter(i -> scooters.get(i).getSerial() == serial)
               .findFirst()
               .orElse(-1);

       if (index != -1) {
           return Optional.of(scooters.get(index));
       } else {
           return Optional.empty();
       }
   }

   public Scooter createScooter(String station) {
       Scooter newScooter = new Scooter(station);
       scooters.add(newScooter);
       System.out.println(STR."Scooter #\{newScooter.getSerial()} added to app list of scooters...");
       return newScooter;
   }

   public User registerUser(String username, String password, short age){
        var newUser = new User(username, password, age);
        registeredUsers.add(newUser);
        System.out.println(STR."New user \{newUser.getUsername()} registered successfully...");
        return newUser;
   }

   public User loginUser(String username, String password){
        for(User user : registeredUsers){
            if(user.getUsername().equals(username)){
                user.login(password);
                return user;
            }
        }
        System.out.println("User not registered...");
        return null;
   }

   public void logoutUser(User user){
        for(User registeredUser : registeredUsers){
            if(registeredUser.getUsername().equals(user.getUsername())){
                user.logout();
            }
        }
   }

   public void print(){
       System.out.println("**********************");
       System.out.println("_____Registered Users_____");
       for(User user : registeredUsers)
           System.out.println(STR."User: \{user.getUsername()}");

       System.out.println("**********************");
       System.out.println("_____Scooters_____");
       for(Scooter scooter: scooters)
           System.out.println(STR."Scooter: #\{scooter.getSerial()} Charge: \{scooter.getCharge()}");

   }
}
