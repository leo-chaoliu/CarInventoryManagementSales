package com.best.carsalesapi.repository;

import com.best.carsalesapi.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
//    Order addNewOrder(CreateOrderRequestModel model);
    
}