package com.educandoweb.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

/* @Repository -> não é necessário nesse caso, pois o UserRepository já está herdando essa anotação
   do JpaRepository. */
public interface OrderRepository extends JpaRepository<Order, Long>{

    

}