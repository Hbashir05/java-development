package com.pluralsight;

public class Cellphone {
    //Sets the variables that will be used for the majority of this assignment
    public int serialNumber;
    public String phoneNumber;
    public String model;
    public String carrier;
    public String owner;

    //The this."" creates objects and allows you to determine what kind of value they have.
    public Cellphone(){
        this.serialNumber = serialNumber;
        this.phoneNumber = phoneNumber;
        this.model = model;
        this.carrier = carrier;
        this.owner = owner;
    }
    //Get statements allows you to retrieve the statement
    public String getModel() {
        return model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Set values determine what the statement is.
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    //This dial function allows the owner to interact with another phone number.
    public void dial(String phoneNumber){
        System.out.print(owner + "'s phone is calling " + phoneNumber);
        System.out.println(" ");

    }
}
