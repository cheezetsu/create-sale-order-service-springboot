package com.project.createsaleorderservice.response;

public class Order {
    
    // private int purchase_order_number;
    
    private String material_number;

    private String material_description;

    private int quantity;

    private float unit_price;

    private float total_price;

    // public int getPurchase_order_number() {
    //     return purchase_order_number;
    // }

    // public void setPurchase_order_number(int purchase_order_number) {
    //     this.purchase_order_number = purchase_order_number;
    // }

    public String getMaterial_number() {
        return material_number;
    }

    public void setMaterial_number(String material_number) {
        this.material_number = material_number;
    }

    public String getMaterial_description() {
        return material_description;
    }

    public void setMaterial_description(String material_description) {
        this.material_description = material_description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(float unit_price) {
        this.unit_price = unit_price;
    }

    public float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }

}
