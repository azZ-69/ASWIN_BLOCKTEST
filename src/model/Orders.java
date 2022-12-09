package model;

import java.util.ArrayList;

public class Orders {

    public Orders(int order_code, String orderType, String userorder, String shipping, ArrayList<Items> items) {
        this.order_code = order_code;
        this.orderType = orderType;
        this.userorder = userorder;
        this.shipping = shipping;
        this.items = items;
    }

    int order_code;
    String orderType;
    String userorder;

    public int getOrder_code() {
        return order_code;
    }

    public void setOrder_code(int order_code) {
        this.order_code = order_code;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getUserorder() {
        return userorder;
    }

    public void setUserorder(String userorder) {
        this.userorder = userorder;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    String shipping;
    ArrayList<Items> items;
}
