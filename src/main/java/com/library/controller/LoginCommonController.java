package com.library.controller;

import com.library.pojo.Reader;
import com.library.pojo.Result;
import com.library.service.LoginCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login/common")
@CrossOrigin(origins = "*", maxAge = 60)
public class LoginCommonController {
    @Autowired
    private LoginCommonService loginCommonService;
    @PostMapping
    public Result login(@RequestBody Reader reader){
        List<Reader> readerList = loginCommonService.select(reader);
        if(readerList.size() != 0){
            return Result.success();
        }
        return Result.error("log failed");
    }
}
