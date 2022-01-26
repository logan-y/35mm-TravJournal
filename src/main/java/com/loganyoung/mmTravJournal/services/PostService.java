package com.loganyoung.mmTravJournal.services;

import com.loganyoung.mmTravJournal.model.PostDto;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<PostDto> findAllPosts();

    PostDto createPost(PostDto post);

    void deletePostById(Long id);

    Optional<PostDto> updatePost(PostDto postDto);

    //findbyid method? filtering methods?

}
