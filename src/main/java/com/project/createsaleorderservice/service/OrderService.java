package com.project.createsaleorderservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.createsaleorderservice.entity.OrderEntity;
import com.project.createsaleorderservice.repository.OrderRepository;
import com.project.createsaleorderservice.response.Order;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Order findOrderByPurchaseOrderNumber(int purchase_order_number) {

        OrderEntity orderEntity = orderRepository.findOrderByPurchaseOrderNumber(purchase_order_number);

        Order order = modelMapper.map(orderEntity, Order.class);

        return order;
    }

}
