package uk.ac.westminster.products_api;

public class Address {

    private String street;
    private String city;
    private String postcode;

    public Address(){}

    public Address(String street,String city, String postcode){
        this.city = city;
        this.postcode = postcode;
        this.street = street;
    }

    public String getStreet(){
        return street;
    }

    public String getCity(){
        return city;
    }

    public String getPostcode(){
        return postcode;
    }
}
