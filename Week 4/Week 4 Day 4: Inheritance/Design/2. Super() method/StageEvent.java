class StageEvent extends Event {
    private int noOfSeats;

    public StageEvent(String name, String detail, String type, String ownerName, double costPerDay, int noOfSeats) {
        super(name, detail, type, ownerName, costPerDay);
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }
}
