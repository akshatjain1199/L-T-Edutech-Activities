public class Main {
    public static void main(String[] args) {
        StallBO stallBO = new StallBO();
        Stall stall = stallBO.readStallFromFile();
        stallBO.display(stall);
    }
}
