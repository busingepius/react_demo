/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 01/03/2024
 * Time : 14:22
 * Project Name : srmapp.model
 */
package srmapp.model;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private Supplier owner;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Supplier getOwner() {
        return owner;
    }

    Address() {
    }

    Address(Supplier owner) {
        this.owner = owner;
    }

    Address(String street, String city, String state, String zipCode, Supplier owner) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.owner = owner;
    }

    public void setAddress(String street, String city, String state, String zipCode, Supplier owner){
        new Address(street, city, state, zipCode, owner);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
