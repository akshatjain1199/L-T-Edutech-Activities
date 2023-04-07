class GoldStall extends SilverStall {
    private Integer tvSet;

    public GoldStall() {}

    public GoldStall(String name, String detail, String owner, Integer cost, Integer tvSet) {
        super(name, detail, owner, cost);
        this.tvSet = tvSet;
    }

    public Integer getTvSet() {
        return tvSet;
    }

    public Integer getTotalCost() {
        return super.cost + tvSet * 100;
    }
}
