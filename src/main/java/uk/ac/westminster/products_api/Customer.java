package uk.ac.westminster.products_api;

public class Customer {
    private Long id;
    private String name;
    private String email;
    private Address address;

    public Customer(){}

    public Customer(Long id, String name, String email, Address address){
        this.address = address;
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public Long getId(){
        return id;
    }

    public Address getAddress() {
        return address;
    }
}
