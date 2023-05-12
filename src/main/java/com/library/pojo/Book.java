package com.library.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Integer id;
    private String bookName;
    private String author;
    private Integer state;
    private LocalDateTime borrowTime;
    private LocalDateTime lastReturnTime;
}
