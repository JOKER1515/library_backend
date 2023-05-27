package com.library.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Integer id;
    private String bookName;
    private String author;
    private Integer state;
    private LocalDate borrowTime;
    private LocalDate lastReturnTime;
}
