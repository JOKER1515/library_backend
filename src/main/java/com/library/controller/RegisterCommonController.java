package com.library.controller;

import com.library.pojo.Reader;
import com.library.pojo.Result;
import com.library.service.RegisterCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/register/common")
@CrossOrigin(origins = "*", maxAge = 60)
public class RegisterCommonController {
    @Autowired
    private RegisterCommonService registerCommonService;

    @PostMapping
    public Result register(@RequestBody Reader reader) {
        List<Reader> readerList = registerCommonService.select(reader);
        if (readerList.size() == 0) {
            registerCommonService.insert(reader);
            return Result.success();
        }
        return Result.error("The reader already exited ");
    }

}
