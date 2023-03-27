
import java.util.*;

class Event {
    private String name;
    private String detail;
    private String type;
    private String ownerName;
    private double costPerDay;

    public Event(String name, String detail, String type, String ownerName, double costPerDay) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.ownerName = ownerName;
        this.costPerDay = costPerDay;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public String getType() {
        return type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getCostPerDay() {
        return costPerDay;
    }
}
