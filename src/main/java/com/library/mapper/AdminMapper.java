package com.library.mapper;

import com.library.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    void insert(Book book);

    void delete(Integer id);

    List<Book> select();
}
