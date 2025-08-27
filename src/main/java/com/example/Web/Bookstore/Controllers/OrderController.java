package com.example.Web.Bookstore.Controllers;

import com.example.Web.Bookstore.Entities.BookOrder;
import com.example.Web.Bookstore.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderRepository orderRepository;

    @Autowired
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping
    public BookOrder placeOrder(@RequestBody BookOrder order) {
        return orderRepository.save(order);
    }

    @GetMapping
    public List<BookOrder> getAllOrders() {
        return orderRepository.findAll();
    }
}