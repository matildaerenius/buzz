package com.matildaerenius.controller;

import com.matildaerenius.entity.Post;
import com.matildaerenius.entity.User;
import com.matildaerenius.dto.response.ApiResponse;
import com.matildaerenius.service.PostService;
import com.matildaerenius.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @Autowired
    UserService userService;

    @PostMapping("/api/posts")
    public ResponseEntity<Post> createPost(
            @RequestHeader("Authorization")String token,
            @RequestBody Post post
            ) throws Exception {
        User reqUser = userService.findUserByJwt(token);
        Post createdPost = postService.createNewPost(post, reqUser.getId());
        return new ResponseEntity<>(createdPost, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/api/posts/{postId}")
    public ResponseEntity<ApiResponse> deletePost(
            @PathVariable int postId,
            @RequestHeader("Authorization")String token) throws Exception {
        User reqUser = userService.findUserByJwt(token);
        String message = postService.deletePost(postId, reqUser.getId());
        ApiResponse res = new ApiResponse(message,true);
        return new ResponseEntity<ApiResponse>(res, HttpStatus.OK);
    }

    @GetMapping("/api/posts/{postId}")
    public ResponseEntity<Post> findPostByIdHandler(@PathVariable int postId) throws Exception {
        Post post = postService.findPostById(postId);
        return new ResponseEntity<>(post, HttpStatus.ACCEPTED);
    }

    @GetMapping("/api/posts/user/{userId}")
    public ResponseEntity<List<Post>> findUsersPosts(@PathVariable int userId) throws Exception {
        List<Post> posts = postService.findPostByUserId(userId);
        return new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
    }

    @GetMapping("/api/posts")
    public ResponseEntity<List<Post>> findAllPosts() throws Exception {
        List<Post> posts = postService.findAllPosts();
        return new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
    }

    @PutMapping("/api/posts/save/{postId}")
    public ResponseEntity<Post> savePostHandler(
            @PathVariable int postId,
            @RequestHeader("Authorization")String token) throws Exception {
        User reqUser = userService.findUserByJwt(token);
        Post post = postService.savedPost(postId, reqUser.getId());
        return new ResponseEntity<>(post, HttpStatus.ACCEPTED);
    }

    @PutMapping("/api/posts/like/{postId}")
    public ResponseEntity<Post> likePostHandler(
            @PathVariable int postId,
            @RequestHeader("Authorization")String token) throws Exception {
        User reqUser = userService.findUserByJwt(token);
        Post post = postService.likePost(postId, reqUser.getId());
        return new ResponseEntity<>(post, HttpStatus.ACCEPTED);
    }
}
