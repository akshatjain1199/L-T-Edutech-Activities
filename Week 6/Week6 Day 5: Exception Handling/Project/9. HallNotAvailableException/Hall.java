class Hall {
    	
    private String name;
    private String contactNumber;
    private String ownerName;
    private Double costPerDay;
    
    Hall(String name){
        this.name = name;
    }
    
    Hall(String name,String contactNumber,Double costPerDay,String ownerName){
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setOwnerName(String name){
        this.ownerName = name;
    }
    public void setContactNumber(String cn){
        this.contactNumber = cn;
    }
    public void setName(Double cost){
        this.costPerDay = cost;
    }
    public String getName(){
        return name;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public String getContactNumber(){
        return contactNumber;
    }
    public Double getCostPerDay(){
        return costPerDay;
    }
}
