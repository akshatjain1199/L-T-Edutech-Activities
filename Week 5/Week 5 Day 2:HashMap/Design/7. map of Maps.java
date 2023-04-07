import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of address:");
    int n = sc.nextInt();
    sc.nextLine();

    Map<String, Map<String, Integer>> stateCityMap = new TreeMap<>();

    for (int i = 0; i < n; i++) {
      System.out.println("Enter the address:");
      String[] address = sc.nextLine().split(",");

      String city = address[1];
      String state = address[2];

      if (stateCityMap.containsKey(state)) {
        Map<String, Integer> cityMap = stateCityMap.get(state);
        cityMap.put(city, cityMap.getOrDefault(city, 0) + 1);
      } else {
        Map<String, Integer> cityMap = new TreeMap<>();
        cityMap.put(city, 1);
        stateCityMap.put(state, cityMap);
      }
    }

    System.out.println("Number of entries in city/state wise:\n");

    for (String state : stateCityMap.keySet()) {
      System.out.println("State:" + state);
      Map<String, Integer> cityMap = stateCityMap.get(state);
      for (String city : cityMap.keySet()) {
        int count = cityMap.get(city);
        System.out.println("City:" + city + " Count:" + count);
      }
      System.out.println();
    }
  }
}
