import java.util.Scanner;

class Event {
    private String eventName;
    private String hallName;
    private String startDate;
    private String endDate;
    private int noOfPeople;

    // Getter methods
    public String getEventName() {
        return eventName;
    }

    public String getHallName() {
        return hallName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getNoOfPeople() {
        return noOfPeople;
    }

    // Setter methods
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }

    public void display() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Hall Name: " + hallName);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("No of People: " + noOfPeople);
    }
}
