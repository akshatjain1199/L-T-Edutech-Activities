import java.util.*;

class UserMainCode {
    public static void findPass(int n, HashMap<Integer, Integer> hashmap) {
        for (int i = 1; i <= n; i++) {
            if (hashmap.containsKey(i) && hashmap.get(i) > 75) {
                System.out.println(i);
            }
        }
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
        UserMainCode.findPass(n, hashmap);
    }
}
