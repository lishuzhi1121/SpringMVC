package com.quvideo.service;

import com.quvideo.config.SpringConfig;
import com.quvideo.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testGetAll() {
        List<Book> books = bookService.getAll();
        System.out.println(books);
    }

    @Test
    public void testGetById() {
        Book book = bookService.getById(4);
        System.out.println(book);
    }




}
