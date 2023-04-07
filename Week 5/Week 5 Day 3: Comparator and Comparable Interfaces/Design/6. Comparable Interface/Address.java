import java.util.*;

class Address implements Comparable<Address> {
    private String username;
    private String addressLine1;
    private String addressLine2;
    private int pinCode;

    public Address(String username, String addressLine1, String addressLine2, int pinCode) {
        this.username = username;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.pinCode = pinCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int compareTo(Address other) {
        if (this.pinCode != other.pinCode) {
            return this.pinCode - other.pinCode;
        } else {
            return this.addressLine1.compareTo(other.addressLine1);
        }
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d", username, addressLine1, addressLine2, pinCode);
    }
}
