package com.example.ecommerce.dao;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.entity.Order;

@CrossOrigin("http://localhost:4200")
public interface OrderRepository extends JpaRepository<Order, Long>{

}
