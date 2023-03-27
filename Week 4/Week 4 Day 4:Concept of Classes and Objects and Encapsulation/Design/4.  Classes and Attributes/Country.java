public class Country {

    public String name;
    public String countryCode;
    public String isdCode;

    public Country(String name, String countryCode, String isdCode) {
        this.name = name;
        this.countryCode = countryCode;
        this.isdCode = isdCode;
    }

    public void display() {
        System.out.println("Country Name : " + name);
        System.out.println("Country Code : " + countryCode);
        System.out.println("ISD Code : " + isdCode);
    }
}
