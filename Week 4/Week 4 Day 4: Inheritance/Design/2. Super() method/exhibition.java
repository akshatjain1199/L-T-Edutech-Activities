class Exhibition extends Event {
    private int noOfStall;

    public Exhibition(String name, String detail, String type, String ownerName, double costPerDay, int noOfStall) {
        super(name, detail, type, ownerName, costPerDay);
        this.noOfStall = noOfStall;
    }

    public int getNoOfStall() {
        return noOfStall;
    }
}
