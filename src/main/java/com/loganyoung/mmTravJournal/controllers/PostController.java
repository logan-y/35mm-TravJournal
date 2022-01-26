package com.loganyoung.mmTravJournal.controllers;

import com.loganyoung.mmTravJournal.model.PostDto;
import com.loganyoung.mmTravJournal.services.PostService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller //change to rest controller to serve up json that will be consumed via js
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class PostController {

    public final PostService postService;

    @GetMapping("/posts")
    public String getAllPosts(Model model) {
        clearModel(model);
        return "posts";
    }

    @PostMapping("/posts")
    public String createNewPost(@ModelAttribute PostDto newPost, Model model) {
        postService.createPost(newPost);
        clearModel(model);
        return "posts";
    }

    @GetMapping("/posts/{id}/delete")
    public String deletePost(@PathVariable Long id, Model model) {
        postService.deletePostById(id);
        clearModel(model);
        return "posts";
    }

    @PostMapping("/posts/{id}")
    public String updatePost(@ModelAttribute PostDto updatedPost, Model model) {
        postService.updatePost(updatedPost);
        clearModel(model);
        return "posts";
    }

    private void clearModel (Model model) {
        model.addAttribute("posts", postService.findAllPosts());
        model.addAttribute("newPost", new PostDto());
        model.addAttribute("updatedPost", new PostDto());
    }


}
