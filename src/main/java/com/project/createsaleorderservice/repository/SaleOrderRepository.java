package com.project.createsaleorderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.createsaleorderservice.entity.SaleOrderEntity;

public interface SaleOrderRepository extends JpaRepository<SaleOrderEntity, Integer> {
    
}
