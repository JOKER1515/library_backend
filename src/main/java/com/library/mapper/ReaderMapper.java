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

    /**
     * 获取最小ID
     */
    int selectMinId(Borrow borrow);

    int search(Borrow borrow);

    void delete(Borrow borrow);

    void updateBookName(Borrow borrow);


    List<Book> selectAllBook(Borrow borrow);

    /**
     * 获取所有图书
     */
    List<Book> selectAllBooks();

    List<Borrow> selectBorrowedBooks(Reader reader);

    List<Book> selectBorrowedBookList(Borrow borrow);

    /**
     * 根据书名查询图书
     */
    List<Book> searchByBookName(Book book);
}
