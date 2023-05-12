package com.library.service.implement;

import com.library.mapper.AdminMapper;
import com.library.pojo.Book;
import com.library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImp implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void insert(Book book) {
        adminMapper.insert(book);
    }

    @Override
    public void delete(Integer id) {
        adminMapper.delete(id);
    }

    @Override
    public List<Book> select() {

        return adminMapper.select();
    }
}
