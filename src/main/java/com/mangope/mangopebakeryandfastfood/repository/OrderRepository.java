package com.mangope.mangopebakeryandfastfood.repository;

import com.mangope.mangopebakeryandfastfood.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}