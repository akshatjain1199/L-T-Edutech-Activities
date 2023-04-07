import java.util.*;
public class Main {
    public static HashMap<String,Integer> sortit(HashMap<String,Integer> map){
        List<Map.Entry<String,Integer>> list=new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2){
                if(o1.getValue()==o2.getValue())
                    return (o2.getKey()).compareTo(o1.getKey());
                else
                    return (o2.getValue()).compareTo(o1.getValue());
            }
        }
        );
        HashMap<String,Integer> newmap=new LinkedHashMap<>();
        for(Map.Entry<String,Integer> emap:list){
            newmap.put(emap.getKey(),emap.getValue());
        }


        return newmap;
    }
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of passengers");
        int n=Integer.parseInt(sc.nextLine());
        HashMap<String,Integer> map=new HashMap<>(); 
        for(int i=1;i<=n;i++){
            System.out.println("Enter the name of the passenger "+i);
            String name=sc.nextLine();
            System.out.println("Enter the age of the passenger "+i);
            int age=Integer.parseInt(sc.nextLine());
            map.put(name,age);
        }
        int i=1;
        HashMap<String,Integer> smap=sortit(map);
        System.out.println("Passengers Details by age(High to Low)");
        for(Map.Entry<String,Integer> me:smap.entrySet()){
            System.out.println(i+" "+me.getKey()+" "+me.getValue());
            i++;
        }
    }
}
