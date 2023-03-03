public class StaticIllustration {
    private Integer i1;
    private static Integer i2;

    public Integer getI1() {
        return i1;
    }

    public void setI1(Integer i1) {
        this.i1 = i1;
    }

    public static Integer getI2() {
        return i2;
    }

    public static void setI2(Integer i2) {
        StaticIllustration.i2 = i2;
    }

    public static void displayDetails(StaticIllustration obj) {
        System.out.println("i1 = " + obj.getI1() + ",i2=" + i2 );
    }
}
