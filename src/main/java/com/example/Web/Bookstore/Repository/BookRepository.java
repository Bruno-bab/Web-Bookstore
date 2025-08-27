package com.example.Web.Bookstore.Repository;

import com.example.Web.Bookstore.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByAuthor(String author);
}