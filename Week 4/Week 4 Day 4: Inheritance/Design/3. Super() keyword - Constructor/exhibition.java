public class Exhibition extends Event {
    private int noOfStalls;
    
    public Exhibition() {
        super();
    }
    
    public Exhibition(String name, String detail, String type, String organiserName, int noOfStalls) {
        super(name, detail, type, organiserName);
        this.noOfStalls = noOfStalls;
    }
    
    public int getNoOfStalls() {
        return noOfStalls;
    }
    
    public void setNoOfStalls(int noOfStalls) {
        this.noOfStalls = noOfStalls;
    }
}
