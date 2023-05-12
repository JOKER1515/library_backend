package com.library.service.implement;

import com.library.mapper.LoginCommonMapper;
import com.library.pojo.Reader;
import com.library.service.LoginCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginCommonServiceImp implements LoginCommonService {

    @Autowired
    private LoginCommonMapper loginCommonMapper;

    @Override
    public List<Reader> select(Reader reader) {
        return loginCommonMapper.select(reader);
    }
}
