package com.library;

import com.library.mapper.AdminMapper;
import com.library.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AdiminApplicationTests {

    @Autowired
    private AdminMapper adminMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void insertTest(){
        Book book = new Book();
        book.setBookName("三国演义");
        book.setAuthor("罗贯中");
        adminMapper.insert(book);
    }

}
