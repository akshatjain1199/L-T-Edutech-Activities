class TicketBooking{
    private String customerName;
    private Integer noOfTickets;
    private Double price;
    
    TicketBooking(){}
    TicketBooking(String customerName, Integer noOfTickets, Double price){
        //Fill code here
        super();
        this.customerName=customerName;
        this.noOfTickets=noOfTickets;
        this.price=price;
    }
    String getCustomerName(){
        return this.customerName;
    }
    Integer getNoOfTickets(){
        return this.noOfTickets;
    }
    Double getPrice(){
        return this.price;
    }
    public String toString() {
        //Fill code her
        return String.format("%-10s %-15s %-15s\n",customerName,noOfTickets,price);
    } 
}
