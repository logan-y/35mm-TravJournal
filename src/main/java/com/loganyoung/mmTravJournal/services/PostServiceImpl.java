package com.loganyoung.mmTravJournal.services;

import com.loganyoung.mmTravJournal.entities.Post;
import com.loganyoung.mmTravJournal.model.PostDto;
import com.loganyoung.mmTravJournal.repositories.PostRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
@Slf4j
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    @Override
    public List<PostDto> findAllPosts() {
        return postRepository.findAll().stream().map(PostDto::new).collect(Collectors.toList());
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = new Post();
//        post.setAddressId(postDto.getAddressId());
        post.setNotes(postDto.getNotes());
        post.setCreationDate(postDto.getDate());
//        post.setFilmId(postDto.getFilmId());
        return new PostDto(postRepository.save(post));
    }

    @Override
    public void deletePostById(Long id) {
        postRepository.deleteById(id);
    }

    @Override
    public Optional<PostDto> updatePost(PostDto postDto) {
        Optional<Post> postOptional = postRepository.findById(postDto.getId());
        if(postOptional.isPresent()){
        Post post = postOptional.get();
        post.setCreationDate(postDto.getDate());
        post.setNotes(postDto.getNotes());
//        post.setFilmId(postDto.getFilmId());
//        post.setAddressId(postDto.getAddressId());
        return Optional.of(new PostDto(postRepository.save(post)));
        }
        return Optional.empty();
    }
}
