package com.library.service;

import com.library.pojo.Book;

import java.util.List;

public interface AdminService {
    void insert(Book book);

    void delete(Integer id);

    List<Book> select();
}
