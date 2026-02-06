package com.wonted79.spring_board.repository;

import com.wonted79.spring_board.domain.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MyBatisPostRepository implements PostRepository {

    private final PostMapper postMapper;

    @Override
    public Post save(Post post) {
        postMapper.insert(post);
        return post;
    }

    @Override
    public void update(Long postId) {
        postMapper.update(postId);
    }

    @Override
    public Optional<Post> findById(Long id) {
        return Optional.ofNullable(postMapper.findById(id));
    }

    @Override
    public List<Post> findAll() {
        return postMapper.findAll();
    }

    @Override
    public void delete(Long postId){
        postMapper.deleteById(postId);
    }
}
