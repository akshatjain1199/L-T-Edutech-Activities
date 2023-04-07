class PlatinumStall extends GoldStall {
    private Integer projector;

    public PlatinumStall() {}

    public PlatinumStall(String name, String detail, String owner, Integer cost, Integer tvSet, Integer projector) {
        super(name, detail, owner, cost, tvSet);
        this.projector = projector;
    }

    public Integer getProjector() {
        return projector;
    }

    public Integer getTotalCost() {
        return super.getTotalCost() + projector * 500;
    }
}
