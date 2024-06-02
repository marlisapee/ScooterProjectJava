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

    public User login(String password){
        if(this.password.equals(password)){
            this.isLoggedIn = true;
            System.out.println(STR."\{this.username} successfully logged in...");
            return this;
        }
        else {
            System.out.println("Wrong password...");
            return null;
        }

    }

    public String logout(){
        this.isLoggedIn = false;
        return "Logged out successfully";
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
