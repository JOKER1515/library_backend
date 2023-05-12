package com.library.service;

import com.library.pojo.Reader;

import java.util.List;

public interface LoginCommonService {

    List<Reader> select(Reader reader);
}
