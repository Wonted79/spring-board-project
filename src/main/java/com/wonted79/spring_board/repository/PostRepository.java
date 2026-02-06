package com.wonted79.spring_board.repository;

import com.wonted79.spring_board.domain.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    Post save(Post post);
    void update(Long postId);
    Optional<Post> findById(Long id);
    List<Post> findAll();
    void delete(Long postId);
}
