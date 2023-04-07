
class SilverStall {
    protected String name;
    protected String detail;
    protected String owner;
    protected Integer cost;

    public SilverStall() {}

    public SilverStall(String name, String detail, String owner, Integer cost) {
        this.name = name;
        this.detail = detail;
        this.owner = owner;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public String getOwner() {
        return owner;
    }

    public Integer getCost() {
        return cost;
    }
}
