package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {

//    private int id;
//    private static int nextId = 1;
//    //Declares the variable nextId.
//    //Since it is static, its changing value is NOT stored within any Employer object.
//    private String value;

//    public Employer() {
//        id = nextId;
//        nextId++;
//    }
    //The first constructor accepts no arguments and assigns the value of nextId to the id field.
    //It then increments nextId. Thus, every new Employer object will get a different ID number.

    public Employer(String value) {
        super(value);
    }



    // Custom toString, equals, and hashCode methods:
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
//        if (this == o) return true;
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o;
//        return getId() == employer.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

    // Getters and Setters:
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

}
