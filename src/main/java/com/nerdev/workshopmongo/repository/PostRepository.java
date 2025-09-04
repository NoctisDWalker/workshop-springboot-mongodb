package com.nerdev.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nerdev.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
