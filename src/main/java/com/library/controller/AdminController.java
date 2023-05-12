package com.library.controller;

import com.library.pojo.Book;
import com.library.pojo.Result;
import com.library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "*", maxAge = 60)
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping
    public Result insert(@RequestBody Book book){
        adminService.insert(book);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        adminService.delete(id);
        return Result.success();
    }

    @GetMapping
    public Result select(){
        List<Book> bookList = adminService.select();
        return Result.success(bookList);
    }
}
