package com.example.demo.repositories;

import com.example.demo.entities.Order;

import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface OrderRepository extends CrudRepository<Order, Long>{
   // List<Order> findByDeliveryZip(String deliveryZip);
}
