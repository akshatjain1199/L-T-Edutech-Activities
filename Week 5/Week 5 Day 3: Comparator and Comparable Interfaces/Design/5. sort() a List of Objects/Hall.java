import java.util.*;

class Hall implements Comparable<Hall> {
    private String name;
    private String contactNumber;
    private double costPerDay;
    private String ownerName;

    public Hall(String name, String contactNumber, double costPerDay, String ownerName) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public int compareTo(Hall other) {
        return Double.compare(this.costPerDay, other.costPerDay);
    }

    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15.1f%-15s", name, contactNumber, costPerDay, ownerName);
    }
}
