package com.library.util;

import com.library.pojo.Book;

import java.util.List;

public class DeleteSame {
    public static void deleteSame(List<Book> bookList) {
        for (int j = 0; j < bookList.size() - 1; j++) {
            for (int k = j + 1; k < bookList.size(); k++) {
                if (bookList.get(j).getBookName().equals(bookList.get(k).getBookName())) {
                    if ((bookList.get(j).getState() == 0 && bookList.get(k).getState() == 0)
                            || (bookList.get(j).getState() != 0 && bookList.get(k).getState() == 0)
                            || (bookList.get(j).getState() != 0 && bookList.get(k).getState() != 0)) {
                        bookList.remove(k);
                        k -= 1;
                    } else {
                        bookList.remove(j);
                        j -= 1;
                        break;
                    }
                }
            }
        }
    }
}
