package com.example.Web.Bookstore.Repository;

import com.example.Web.Bookstore.Entities.BookOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<BookOrder, Long> {
}