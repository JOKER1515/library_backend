package com.library.service;

import com.library.pojo.Reader;

import java.util.List;

public interface RegisterCommonService {
    void insert(Reader reader);

    List<Reader> select(Reader reader);
}
