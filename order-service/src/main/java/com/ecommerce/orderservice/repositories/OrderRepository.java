package com.ecommerce.orderservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.orderservice.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
