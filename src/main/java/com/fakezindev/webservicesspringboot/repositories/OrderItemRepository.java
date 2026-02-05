package com.fakezindev.webservicesspringboot.repositories;

import com.fakezindev.webservicesspringboot.entities.OrderItem;
import com.fakezindev.webservicesspringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
