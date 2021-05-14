package com.curso_java.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso_java.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}