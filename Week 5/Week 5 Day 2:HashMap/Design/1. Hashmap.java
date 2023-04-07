import java.util.*;

class UserMainCode {
    public static int getSumOfEven(int n, HashMap<Integer, Integer> hashmap) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (hashmap.containsKey(2*i)) {
                sum += hashmap.get(2*i);
            }
        }
        return sum;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            hashmap.put(key, value);
        }
        int sum = UserMainCode.getSumOfEven(n, hashmap);
        System.out.println(sum);
    }
}
