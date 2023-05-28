package com.library.controller;

import com.library.pojo.Book;
import com.library.pojo.Borrow;
import com.library.pojo.Reader;
import com.library.pojo.Result;
import com.library.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reader")
@CrossOrigin(origins = "*", maxAge = 60)
public class ReaderController {

    @Autowired
    private ReaderService readerService;

    @GetMapping("allBooks")
    public Result selectAll(){
        List<Book> bookList = readerService.selectAllBooks();
        return Result.success(bookList);
    }

    @PutMapping("borrowedBooks")
    public  Result selectBorrowedBooks(@RequestBody Reader reader){
        List<Book> bookList = readerService.selectBorrowedBooks(reader);
        return Result.success(bookList);
    }

    @PostMapping("/search")
    public Result select(@RequestBody Reader reader) {
        List<Book> bookList = readerService.select(reader);
        return Result.success(bookList);
    }

    @PostMapping("/borrow")
    public Result insert(@RequestBody Borrow borrow) {

        Reader reader = new Reader(borrow.getReaderId(), "","","");
        //查询所有符合的书籍
        List<Book> bookList = readerService.selectAllBook(borrow);
        List<Book> borrowList = readerService.selectBorrowedBooks(reader);
        for (Book book:borrowList
             ) {
            if(book.getBookName().equals(borrow.getBookName())){
                return Result.error("书本已经被借走");
            }
        }
        if (bookList.size() != 0) {
            //查询符合条件的书本的最小ID
            int id = readerService.selectMinId(borrow);
            //将id置入borrow参数
            borrow.setBookId(id);
            //往borrow表当中置入数据
            readerService.insert(borrow);
            //将书本state置为0
            readerService.update(borrow);
            return Result.success();
        }
        return Result.error("书本不存在或者已经被借走");
    }

    @PostMapping("/return")
    public Result delete(@RequestBody Borrow borrow) {
        //查询书本名称对应的书本ID
        readerService.bookReturn(borrow);
        return Result.success();
    }
}
