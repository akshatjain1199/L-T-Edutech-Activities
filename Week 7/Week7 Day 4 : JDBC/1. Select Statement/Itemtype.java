public class ItemType {
    Long id;
    String name;
    Double deposit,costPerDay;
    ItemType(Long id,String name,Double deposit,Double costPerDay){
     this.id=id;
     this.name=name;
     this.deposit=deposit;
     this.costPerDay=costPerDay;
    }
    public Long getId(){
        return id;
    }
        public String getName(){
        return name;
    }
        public Double getDeposit(){
        return deposit;
    }
        public Double getCostPerDay(){
        return costPerDay;
    }
}
