package com.wonted79.spring_board.repository;

import com.wonted79.spring_board.domain.Post;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface PostMapper {

    void insert(Post post);

    void update(Long id);

    void deleteById(Long id);

    Post findById(Long id);

    List<Post> findAll();

}
