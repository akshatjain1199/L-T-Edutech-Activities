public class StageEvent extends Event {
    private Integer noOfShows;
    private Integer noOfSeatsPerShow;
    
    public StageEvent(String name, String detail, String ownerName, Integer noOfShows, Integer noOfSeatsPerShow) {
        super(name, detail, ownerName);
        this.noOfShows = noOfShows;
        this.noOfSeatsPerShow = noOfSeatsPerShow;
    }
    
    public Integer getNoOfShows() {
        return noOfShows;
    }
    
    public void setNoOfShows(Integer noOfShows) {
        this.noOfShows = noOfShows;
    }
    
    public Integer getNoOfSeatsPerShow() {
        return noOfSeatsPerShow;
    }
    
    public void setNoOfSeatsPerShow(Integer noOfSeatsPerShow) {
        this.noOfSeatsPerShow = noOfSeatsPerShow;
    }
    
    @Override
    public Double projectedRevenue() {
        return noOfShows * noOfSeatsPerShow * 50.0;
    }
}
