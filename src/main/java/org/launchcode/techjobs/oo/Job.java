package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

//    ID:  _______
//    Name: _______
//    Employer: _______
//    Location: _______
//    Position Type: _______
//    Core Competency: _______


//@Override
//    public String toString() {
//        if (name == null || name.isEmpty() ||
//                employer == null || employer.getValue().isEmpty() ||
//                location == null || location.getValue().isEmpty() ||
//                positionType == null || positionType.getValue().isEmpty() ||
//                coreCompetency == null || coreCompetency.getValue().isEmpty()) {
//            System.out.println("Data not available");
//        }

    //I need to create a loop, cuz this current condition is just if any field is null/empty
    //print "Data not available" I need to iterate thru each value and apply that msg to only the
    //null/empty key while keeping the appropriate fields that were completed

//    String[] fields = {"ID", "Name", "Employer", "Location", "Position Type", "Core Competency"};
//    String[] dataEntered = {String.valueOf(this.getId()), this.getName(), this.getEmployer().toString(), this.getLocation().toString(), this.getPositionType().toString(), this.getCoreCompetency().toString()};
//
//    for (int i = 0; i < dataEntered.length; i++) {
//        if (dataEntered[i] == null || dataEntered[i].isEmpty()) {
//            dataEntered[i] = "Data not available";
//        }
//    }


    private String output(String field, String dataEntered) {
        String colon = ": ";
        if (dataEntered == null || dataEntered.isEmpty()) {
            dataEntered = "Data not available";
        }
        return field + colon + dataEntered;
    }
@Override
public String toString() {
    String idOutput = output("ID", String.valueOf(this.id));
    String nameOutput = output("Name", this.name);
    String employerOutput = output("Employer", String.valueOf(this.employer));
    String locationOutput = output("Location", String.valueOf(this.location));
    String positionTypeOutput = output("Position Type", String.valueOf(this.positionType));
    String coreCompetencyOutput = output("Core Competency", String.valueOf(this.coreCompetency));

    return "\n" +
            idOutput +
            "\n" +
            nameOutput +
            "\n" +
            employerOutput +
            "\n" +
            locationOutput +
            "\n" +
            positionTypeOutput +
            "\n" +
            coreCompetencyOutput +
            "\n";
}




    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

//add getters for each field EXCEPT nextId.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    //add setters for each field EXCEPT nextID and id.


    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}

