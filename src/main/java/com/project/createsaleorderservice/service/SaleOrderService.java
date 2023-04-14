package com.project.createsaleorderservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.createsaleorderservice.entity.SaleOrderEntity;
import com.project.createsaleorderservice.repository.SaleOrderRepository;
import com.project.createsaleorderservice.response.Order;
import com.project.createsaleorderservice.response.SaleOrder;

@Service
public class SaleOrderService {

    @Autowired
    private SaleOrderRepository saleOrderRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private RestTemplate restTemplate;
    
    public SaleOrder getSaleOrderByID(int purchase_order_number) {

        SaleOrderEntity saleOrderEntity = saleOrderRepository.findById(purchase_order_number).get();

        SaleOrder saleOrder = modelMapper.map(saleOrderEntity, SaleOrder.class);

        Order order = restTemplate.getForObject("http://localhost:8072/orders/{purchase_order_number}", Order.class, purchase_order_number);

        saleOrder.setOrder(order);

        // SaleOrder so = new SaleOrder();
        // so.setPurchase_order_number(saleOrder.getPurchase_order_number());
        // so.setOrder_number(saleOrder.getOrder_number());
        // so.setPurchase_order_date(saleOrder.getPurchase_order_date());
        // so.setDelivery_date(saleOrder.getDelivery_date());
        // so.setShipment_terms(saleOrder.getShipment_terms());
        // so.setPayment_terms(saleOrder.getPayment_terms());
        // so.setSubtotal(saleOrder.getSubtotal());
        // so.setTax(saleOrder.getTax());
        // so.setTotal_net_price(saleOrder.getTotal_net_price());
        // so.setBilling_address(saleOrder.getBilling_address());
        // so.setShipping_address(saleOrder.getShipping_address());

        return saleOrder;
    }

}
