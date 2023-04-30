package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    //What fields do ALL FOUR of the classes have in common?
    //id, nextId, value
    //Which constructors are the same in ALL FOUR classes?
    //(String value) and () empty for setting nextId
    //What getters and setters do ALL of the classes share?
    //getId, getValue, setValue
    //Which custom methods are identical in ALL of the classes?
    //toString, equals, hashCode

    //declare each of the common fields
    public int id;
    public static int nextId = 1;
    public String value;


    //code the constructors
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this(); //calls first constructor to initialize the id field
        this.value = value; //initialize the value field for a new JobField object
    }

    //custom methods
    @Override //creates String from value
    public String toString() {
        return value;
    }

    @Override // Two objects are equal if they have the same id.
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override //generate a hash code based on the value of the id field
    public int hashCode() {
        return Objects.hash(getId());
    }

    //use Generate to create the getters and setters

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



}
