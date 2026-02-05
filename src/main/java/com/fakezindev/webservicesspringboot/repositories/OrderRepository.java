package com.fakezindev.webservicesspringboot.repositories;

import com.fakezindev.webservicesspringboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
