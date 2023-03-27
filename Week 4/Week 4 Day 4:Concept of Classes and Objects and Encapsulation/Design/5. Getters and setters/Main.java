import java.util.*;

class Player {
    private String name;
    private Integer age;
    private String country;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Player p = new Player();

        System.out.println("Enter Name:");
        String name = scn.nextLine();
        p.setName(name);

        System.out.println("Enter Age:");
        Integer age = scn.nextInt();
        p.setAge(age);

        scn.nextLine(); 

        System.out.println("Enter Country:");
        String country = scn.nextLine();
        p.setCountry(country);

        System.out.println("Player Details:");
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Country: " + p.getCountry());
    }
}
