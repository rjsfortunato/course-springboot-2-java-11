package com.curso_java.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso_java.course.entities.OrderItem;

public interface  OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
