import java.util.*;
import java.util.stream.Collectors;


public class Product {
    String name;
    String brand;
    String productCategory;
    String color;
    Double price;
    public Product() {
        super();

    }
    public Product(String name, String brand, String productCategory, String color, Double price) {
        super();
        this.name = name;
        this.brand = brand;
        this.productCategory = productCategory;
        this.color = color;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getProductCategory() {
        return productCategory;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public List<Product> getAllProducts(){
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product("Chai","Plywood","furniture","brown",4999.0));
        productList.add(new Product("Laptop","Dell","computer","black",37000.0));
        productList.add(new Product("USB","HP","USB","white",1000.0));
        productList.add(new Product("Bed","Deluxe","furniture","brown",12000.0));
        productList.add(new Product("Diningtable","Plywood","furniture","yellow",10000.0));
        productList.add(new Product("Designerchair","Mintwud","Furniture","White",23500.0));
        productList.add(new Product("WashingMachine","Samsung","Electronics","Black",17000.0));
        productList.add(new Product("Aircooler","Panasonic","Electronics","Black",24000.0));
        productList.add(new Product("Recliner","Samsung","Furniture","Brown",14000.0));
        productList.add(new Product("DiningSet","LG","Furniture","Blue",9000.0));
        productList.add(new Product("QueenSizeBed","Deluxe","Furniture","White",16000.0));
        productList.add(new Product("Wardrobe","Stanley","Furniture","Pink",40000.0));
        productList.add(new Product("DigitalOven","Mintwud","Electronics","Black",10000.0));
        return productList;
    }
    
    public List<Product> filterProducts(Double price){
        //fill your code here
        List<Product> flist=getAllProducts();
        List<Product> finalflist=flist.stream().filter(i->i.getPrice()<=price).collect(Collectors.toList());
        return finalflist;
    }


    public String toString(){
        return String.format("%-20s %-20s %-20s %-10s %s",getName(),getBrand(),getProductCategory(),getColor(),getPrice());
    }
        
}
