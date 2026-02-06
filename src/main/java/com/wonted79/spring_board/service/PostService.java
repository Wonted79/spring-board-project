package com.wonted79.spring_board.service;

import com.wonted79.spring_board.domain.Post;
import com.wonted79.spring_board.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Post addPost(Post post){
        return postRepository.save(post);
    }

    public void update(Long postId) {
        postRepository.update(postId);
    }

    public Optional<Post> findById(Long postId){
        return postRepository.findById(postId);
    }

    public List<Post> findPosts(){
        return postRepository.findAll();
    }

}
