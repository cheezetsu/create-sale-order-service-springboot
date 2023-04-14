package com.project.createsaleorderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.createsaleorderservice.response.Order;
import com.project.createsaleorderservice.response.SaleOrder;
import com.project.createsaleorderservice.service.OrderService;
import com.project.createsaleorderservice.service.SaleOrderService;

@RestController
public class SaleOrderController {

    @Autowired
    private SaleOrderService saleOrderService;

    @Autowired
    private OrderService orderService;
    
    @GetMapping("/saleorders/{purchase_order_number}")
    public ResponseEntity<SaleOrder> getSaleOrderDetails(@PathVariable("purchase_order_number") int purchase_order_number) {
        
        //database calling
        SaleOrder saleOrder = saleOrderService.getSaleOrderByID(purchase_order_number);

        return ResponseEntity.status(HttpStatus.OK).body(saleOrder);
    }

    @GetMapping("/orders/{purchase_order_number}")
    public ResponseEntity<Order> findOrderByPurchaseOrderNumber(@PathVariable("purchase_order_number") int purchase_order_number) {
        
        Order order = null;

        order = orderService.findOrderByPurchaseOrderNumber(purchase_order_number);

        return ResponseEntity.status(HttpStatus.OK).body(order);
    }

}
