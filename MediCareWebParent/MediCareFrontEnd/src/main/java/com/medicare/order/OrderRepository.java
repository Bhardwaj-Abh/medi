package com.medicare.order;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.common.entity.order.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
