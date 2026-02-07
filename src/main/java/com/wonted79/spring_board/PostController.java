package com.wonted79.spring_board;

import com.wonted79.spring_board.domain.Post;
import com.wonted79.spring_board.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/list")
    public String posts(Model model){
        List<Post> posts = postService.findPosts();
        model.addAttribute("posts",posts);
        return "board/list";
    }

    @GetMapping("/{postId}")
    public String post(@PathVariable Long postId, Model model){
        Post post = postService.findById(postId).orElseThrow(() -> new IllegalArgumentException("게시글 없음"));
        model.addAttribute("post",post);
        return "board/detail";
    }

    @GetMapping("/add")
    public String addForm(){
        return "board/addForm";
    }

    @PostMapping("/add")
    public String addPost(@ModelAttribute Post post, RedirectAttributes redirectAttributes) {
        Post savedPost = postService.addPost(post);
        redirectAttributes.addAttribute("postId", savedPost.getId());
        redirectAttributes.addAttribute("status",true);
        return "redirect:/board/{postId}";
    }

    @GetMapping("{postId}/edit")
    public String editForm(@PathVariable Long postId, Model model){
        Post post = postService.findById(postId).orElseThrow(()->new IllegalArgumentException("존재하지 않는 ID"));
        model.addAttribute("post",post);
        return "board/editForm";
    }
}
