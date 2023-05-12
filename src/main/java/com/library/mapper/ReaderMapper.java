package com.library.mapper;

import com.library.pojo.Book;
import com.library.pojo.Borrow;
import com.library.pojo.Reader;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReaderMapper {
    List<Book> select(Reader reader);

    void insert(Borrow borrow);

    void update(Borrow borrow);

    int selectMinId(Borrow borrow);

    int search(Borrow borrow);

    void delete(Borrow borrow);

    void updateBookName(Borrow borrow);

    List<Book> selectAllBook(Borrow borrow);

    List<Book> selectAllBooks();
}
