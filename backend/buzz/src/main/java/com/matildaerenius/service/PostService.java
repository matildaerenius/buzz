package com.matildaerenius.service;

import com.matildaerenius.entity.Post;

import java.util.List;

public interface PostService {

    Post createNewPost(Post post, int userId) throws Exception;

    String deletePost(int postId, int userId) throws Exception;

    List<Post> findPostByUserId(int userId) throws Exception;

    Post findPostById(int postId) throws Exception;

    List<Post> findAllPosts() throws Exception;

    Post savedPost(int postId, int userId) throws Exception;

    Post likePost(int postId, int userId) throws Exception;

}
