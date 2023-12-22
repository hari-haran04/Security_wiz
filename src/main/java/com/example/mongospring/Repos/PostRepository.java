package com.example.mongospring.Repos;

import com.example.mongospring.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post,String> {
    List<Post> findAll();
}
