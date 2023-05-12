package com.library.service.implement;

import com.library.mapper.RegisterCommonMapper;
import com.library.pojo.Reader;
import com.library.service.RegisterCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterCommonServiceImp implements RegisterCommonService {

    @Autowired
    private RegisterCommonMapper registerCommonMapper;

    @Override
    public void insert(Reader reader) {
        registerCommonMapper.insert(reader);
    }

    @Override
    public List<Reader> select(Reader reader) {
        return registerCommonMapper.select(reader);
    }
}
