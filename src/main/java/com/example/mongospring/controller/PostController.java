package com.example.mongospring.controller;

import com.example.mongospring.Model.Post;
import com.example.mongospring.Repos.PostRepository;
import com.example.mongospring.Repos.SearchInterfaceIm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@EnableMongoRepositories
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchInterfaceIm srepo;

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return srepo.findBytext(text);
    }

    @PostMapping("/post")
    public Post addpost(@RequestBody Post post){
        return repo.save(post);
    }
}
