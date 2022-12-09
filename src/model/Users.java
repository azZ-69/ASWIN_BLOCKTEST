package model;

import java.util.ArrayList;

public class Users {
    String name;
    String address;
    String email;
    int phone;
    ArrayList<Orders> order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public ArrayList<Orders> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Orders> order) {
        this.order = order;
    }

    public Users(String name, String address, String email, int phone, ArrayList<Orders> order) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.order = order;
    }
}
