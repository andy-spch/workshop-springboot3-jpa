package com.educandoweb.course.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.Repositories.OrderRepository;
import com.educandoweb.course.entities.Order;

@Service // registra como component spring, e essa classe poderá ser instanciada por @Autowired
public class OrderService {
    
    @Autowired
    private OrderRepository userRepository;

    public List<Order> findAll(){
        return userRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = userRepository.findById(id);
        return obj.get();
    }

}
