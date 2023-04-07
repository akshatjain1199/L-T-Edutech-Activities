import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


class CallLog{
    String email;
    String numberCalled;
    String startTime;
    String endTime;
    public CallLog(String email, String numberCalled, String startTime, String endTime) {
        this.email = email;
        this.numberCalled = numberCalled;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
}


class Main{
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line = null;
        ArrayList<String> list = new ArrayList<>();
        while((line = br.readLine())!=null){
            list.add(line);
        }
        Map<String,ArrayList<CallLog>> map = new TreeMap<>();
        for(int i=0;i<list.size();i++){
            String arr[] = list.get(i).split(",");
            if(map.containsKey(arr[0])){
                CallLog ob = new CallLog(arr[0], arr[1], arr[2], arr[3]);
                ArrayList<CallLog> customer = map.get(arr[0]);
                customer.add(ob);
                map.put(arr[0],customer);
            }
            else{
                ArrayList<CallLog> customer = new ArrayList<>();
                customer.add(new CallLog(arr[0], arr[1], arr[2], arr[3]));
                map.put(arr[0],customer);
            }
        }


        for(Map.Entry<String,ArrayList<CallLog>> e : map.entrySet()){
            System.out.println("Calls made by "+e.getKey()+" :");
            for(int i=0;i<e.getValue().size();i++){
                System.out.println("Number Called : "+e.getValue().get(i).numberCalled+"  Call Time: "+e.getValue().get(i).startTime);
            }
        }
    }
}
