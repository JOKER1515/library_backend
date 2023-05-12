package com.library.mapper;

import com.library.pojo.Reader;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RegisterCommonMapper {
    void insert(Reader reader);

    List<Reader> select(Reader reader);
}
