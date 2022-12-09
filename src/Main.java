import model.Items;
import model.Orders;
import model.Users;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Items i1 = new Items("Pant", 001, "Levis", 2000, "Cotton");
        Items i2 = new Items("Shirt", 002, "Gucci", 3000, "Leather");
        Items i3 = new Items("Sweater", 004, "Louis V", 1500, "Wool");
        Items i4 = new Items("Hoodie", 005, "Essentials", 4000, "Light Cotton");
        Items i5 = new Items("Shoes", 006, "Nike", 6000, "Leather");

        i1.print_items();

        ArrayList<Items> orders1 = new ArrayList<>();
        orders1.add(i1);
        orders1.add(i2);

        ArrayList<Items> orders2 = new ArrayList<>();
        orders2.add(i3);
        orders2.add(i4);


        Orders o1 = new Orders(100, "WTax", "Summer", "Delivery", orders1);
        Orders o2 = new Orders(201, "WOTax", "Winter", "NoDelivery", orders2);


        ArrayList<Orders> user1 = new ArrayList<>();
        user1.add(o1);
        ArrayList<Orders> user2 = new ArrayList<>();
        user2.add(o2);


        Users u1 = new Users("Ram", "Chabhail", "ram123@gmail.com", 98189099, user1);
        Users u2 = new Users("Hari", "Mitrapark", "hari0012@yahoo.com", 97890900, user2);


    }
}
