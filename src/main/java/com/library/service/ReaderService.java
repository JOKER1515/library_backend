package com.library.service;

import com.library.pojo.Book;
import com.library.pojo.Borrow;
import com.library.pojo.Reader;

import java.util.List;

public interface ReaderService {
    List<Book> select(Reader reader);

    void insert(Borrow borrow);

    void update(Borrow borrow);

    int selectMinId(Borrow borrow);

    void bookReturn(Borrow borrow);

    List<Book> selectAllBook(Borrow borrow);

    List<Book> selectAllBooks();

    List<Book> selectBorrowedBooks(Reader reader);
}
