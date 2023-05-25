package com.codeup.bigfootspringblog.controllers;

import com.codeup.bigfootspringblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String allPosts(Model model) {
        ArrayList<Post> posts = new ArrayList<>();
        Post post1 = new Post("Hello", "World");
        Post post2 = new Post("Title 2", "Body 2");
        Post post3 = new Post("Title C", "Body C");
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        model.addAttribute("posts", posts);

        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String individualPost(Model model) {
        Post individualPost = new Post("Single post", "lorem ipsum");

        model.addAttribute("post", individualPost);

        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showCreateForm() {
        return "view the form for creating the post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String submitCreateForm() {
        return "create a new post";
    }
}
