import java.util.*;
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private Integer pincode;

    public Address(String addressLine1, String addressLine2, String city, String state, Integer pincode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public static Map<String, List<Address>> generateCityAddressMap(Map<String, List<Address>> cityAddressMap,
                                                                    Address address) {
        String city = address.getCity();
        List<Address> addresses = cityAddressMap.getOrDefault(city, new ArrayList<>());
        addresses.add(address);
        cityAddressMap.put(city, addresses);
        return cityAddressMap;
    }

    public static List<Address> searchCity(Map<String, List<Address>> cityAddressMap, String city) {
        return cityAddressMap.getOrDefault(city, new ArrayList<>());
    }
}
