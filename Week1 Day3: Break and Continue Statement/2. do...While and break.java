import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0;
        while (scn.hasNext()) {  
            String id = scn.next();
            id=id.toLowerCase();
            if (id.length()!=4 || id.charAt(0)<'0' || id.charAt(0)>'9'
              || id.charAt(1)<'0' || id.charAt(1)>'9' || id.charAt(2)<'a'  || 
              id.charAt(2)>'z' || id.charAt(3)<'a' || id.charAt(3)>'z') {
                break;
            }
            String name = scn.next();
            String valid = scn.next();
            count++;
            if(valid.equals("no")) {
            }
        }
        System.out.println(count);
    }
}
