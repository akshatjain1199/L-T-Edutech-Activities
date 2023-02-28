import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter the text from the document");
    String text= scn.nextLine().trim();
    System.out.println("Enter the string to be found in the data");
    String found= scn.nextLine().trim();
    if(text.contains(found)){
        System.out.println("String is found in the document");
    }
    else{
        System.out.println("String is not found in the document");
    }
        
     }
}
