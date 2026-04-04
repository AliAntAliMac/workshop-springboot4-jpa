package com.aaam.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aaam.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
