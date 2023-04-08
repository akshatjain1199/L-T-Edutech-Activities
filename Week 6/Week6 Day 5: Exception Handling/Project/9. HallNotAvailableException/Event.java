class Event {
    
    private String name;
	private String detail;
    private String ownerName;
	private String type;
	
    Event(String name){
        this.name = name;
    }
    
    Event(String name,String detail,String ownerName,String type){
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
        this.type = type;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setDetail(String detail){
        this.detail = detail;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getName(){
        return this.name;
    }
    public String getOwnerName(){
        return this.ownerName;
    }
    public String getType(){
        return this.type;
    }
    public String getDetail(){
        return this.detail;
    }
}
