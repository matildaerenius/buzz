package com.matildaerenius.service;

import com.matildaerenius.models.Post;
import com.matildaerenius.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImplementation implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public Post createNewPost(Post post, int userId) throws Exception {
        return null;
    }

    @Override
    public String deletePost(int postId, int userId) throws Exception {
        return "";
    }

    @Override
    public List<Post> findPostByUserId(int userId) throws Exception {
        return List.of();
    }

    @Override
    public Post findPostById(int postId) throws Exception {
        return null;
    }

    @Override
    public List<Post> findAllPosts() throws Exception {
        return List.of();
    }

    @Override
    public Post savedPost(int postId, int userId) throws Exception {
        return null;
    }

    @Override
    public Post likePost(int postId, int userId) throws Exception {
        return null;
    }
}
