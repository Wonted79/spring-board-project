package com.wonted79.spring_board.service;

import com.wonted79.spring_board.domain.Post;
import com.wonted79.spring_board.repository.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostMapper postMapper;

    public Post addPost(Post post) {
        postMapper.insert(post);
        return post;
    }

    public void update(Long postId) {
        postMapper.update(postId);
    }

    public void delete(Long postId) {
        postMapper.deleteById(postId);
    }

    public Optional<Post> findById(Long postId){

        return Optional.ofNullable(postMapper.findById(postId));
    }

    public List<Post> findPosts(){
        return postMapper.findAll();
    }

}
