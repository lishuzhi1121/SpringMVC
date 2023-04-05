package com.quvideo.service;

import com.quvideo.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    boolean save(Book book);
    boolean delete(Integer id);
    boolean update(Book book);
    List<Book> getAll();
    Book getById(Integer id);
}
