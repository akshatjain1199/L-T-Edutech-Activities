class ItemType 
{
    private String name;
    private double costPerDay;
    private double deposit;

    public ItemType()
     {
    }

    public ItemType(String name, double costPerDay, double deposit) 
    {
        this.name = name;
        this.costPerDay = costPerDay;
        this.deposit = deposit;
    }

    public String getName() 
    {
        return name;
    }

    public double getCostPerDay() 
    {
        return costPerDay;
    }

    public double getDeposit() 
    {
        return deposit;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setCostPerDay(double costPerDay) 
    {
        this.costPerDay = costPerDay;
    }

    public void setDeposit(double deposit) 
    {
        this.deposit = deposit;
    }
}
