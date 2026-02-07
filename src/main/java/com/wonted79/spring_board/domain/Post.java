package com.wonted79.spring_board.domain;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Post{
    private Long id;
    private Long userId;
    private String title;
    private String content;
    private int viewCount;
    private LocalDateTime createdAt;
}
