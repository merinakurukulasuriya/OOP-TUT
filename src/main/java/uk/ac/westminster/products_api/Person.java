package uk.ac.westminster.products_api;

public class Person {
    private String name;
    private String email;

    //No Argument Constructor
    public Person(){
    }

    //Constructor
    public Person(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setName(){
        this.name = name;
    }

    public void setEmail(){
        this.email = email;
    }





}
