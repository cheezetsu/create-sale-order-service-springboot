package com.project.createsaleorderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.createsaleorderservice.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
    
    // order based on a purchase order number
    @Query(nativeQuery = true, value = "SELECT order_from_order.purchase_order_number, order_from_order.material_number, order_from_order.material_description, order_from_order.quantity, order_from_order.unit_price, order_from_order.total_price FROM createsaleorderservice.order order_from_order join createsaleorderservice.saleorder order_from_saleorder on order_from_saleorder.purchase_order_number = order_from_order.purchase_order_number where order_from_order.purchase_order_number =:purchase_order_number")
    OrderEntity findOrderByPurchaseOrderNumber(@Param("purchase_order_number") int purchase_order_number);

}
