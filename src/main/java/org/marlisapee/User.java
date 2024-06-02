package org.marlisapee;

public class User {
    private String username;
    private String password;
    private short age;
    private boolean isLoggedIn = false;

    public User(String username, String password, short age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public void login(String password){
        if(this.password.equals(password)){
            this.isLoggedIn = true;
            System.out.println(STR."\{this.username} successfully logged in...");
        }
        else {
            System.out.println("Wrong password...");
        }

    }

    public void logout(){
        this.isLoggedIn = false;
        System.out.println(STR."\{this.getUsername()} logged out successfully...");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
}
