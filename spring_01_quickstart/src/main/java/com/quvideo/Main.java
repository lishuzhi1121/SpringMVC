package com.quvideo;

import com.quvideo.service.BookService;
import com.quvideo.service.impl.BookServiceImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}