package com.quvideo.controller;

import com.quvideo.domain.Book;
import com.quvideo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public String save(@RequestBody Book book) {
        System.out.println("Book save: "+book);
        return "{\"module\": \"Book Save\"}";
    }

    @GetMapping
    public List<Book> getAll() {
        System.out.println("Books getAll...");
        Book book1 = new Book();
        book1.setType("计算机");
        book1.setName("SpringMVC 入门教程");
        book1.setDescription("小试牛刀");

        Book book2 = new Book();
        book2.setType("计算机");
        book2.setName("SpringMVC 实战教程");
        book2.setDescription("一代宗师");

        Book book3 = new Book();
        book3.setType("计算机");
        book3.setName("SpringMVC 进阶教程");
        book3.setDescription("一代宗师, 呕心力作");

        ArrayList<Book> booksList = new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        return booksList;
    }

}
