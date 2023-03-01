import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter the string");
    String s= scn.nextLine();
    String updated= "";
    for(int i=0;i<=s.length()-1;i++){
        char current= s.charAt(i);
        updated= updated+current;
        {
            if(i<s.length()-1 && current==s.charAt(i+1)){
                updated=updated+"*";
            }
        }
    }
    System.out.println("The processed string is "+updated);
        
     }
}
