package com.project.createsaleorderservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "saleorder")
public class SaleOrderEntity {

    @Id
    @Column(name = "purchase_order_number")
    private int purchase_order_number;

    @Column(name = "order_number")
    private int order_number;

    @Column(name = "purchase_order_date")
    private String purchase_order_date;

    @Column(name = "delivery_date")
    private String delivery_date;

    @Column(name = "shipment_terms")
    private String shipment_terms;

    @Column(name = "payment_terms")
    private String payment_terms;

    @Column(name = "subtotal")
    private float subtotal;

    @Column(name = "tax")
    private float tax;

    @Column(name = "total_net_price")
    private float total_net_price;

    @Column(name = "billing_address")
    private String billing_address;

    @Column(name = "shipping_address")
    private String shipping_address;

    public int getOrder_number() {
        return order_number;
    }

    public int getPurchase_order_number() {
        return purchase_order_number;
    }

    public void setPurchase_order_number(int purchase_order_number) {
        this.purchase_order_number = purchase_order_number;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }

    public String getPurchase_order_date() {
        return purchase_order_date;
    }

    public void setPurchase_order_date(String purchase_order_date) {
        this.purchase_order_date = purchase_order_date;
    }

    public String getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }

    public String getShipment_terms() {
        return shipment_terms;
    }

    public void setShipment_terms(String shipment_terms) {
        this.shipment_terms = shipment_terms;
    }

    public String getPayment_terms() {
        return payment_terms;
    }

    public void setPayment_terms(String payment_terms) {
        this.payment_terms = payment_terms;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getTotal_net_price() {
        return total_net_price;
    }

    public void setTotal_net_price(float total_net_price) {
        this.total_net_price = total_net_price;
    }

    public String getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(String billing_address) {
        this.billing_address = billing_address;
    }

    public String getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }

}
