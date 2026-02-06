package com.wonted79.spring_board.domain;
import lombok.Data;

@Data
public class Post{
    private Long id;
    private Long userId;
    private String title;
    private String content;
    private int viewCount;
    private String createdAt;
}
