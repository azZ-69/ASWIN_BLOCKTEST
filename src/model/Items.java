package model;

public class Items {
    public Items(String name, int code, String brand, int price, String material) {
        this.name = name;
        this.code = code;
        this.brand = brand;
        this.price = price;
        this.material = material;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    int code;
    String brand;
    int price;
    String material;


    public void print_items() {
        System.out.println("Item Name: " + this.name + "\n"
                + " Code : " + this.code + "\n"
                + " Brand :" + this.brand + "\n"
                + " Price :" + this.price);
    }

}