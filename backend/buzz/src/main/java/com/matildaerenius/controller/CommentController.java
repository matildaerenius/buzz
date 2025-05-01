package com.matildaerenius.controller;

import com.matildaerenius.entity.Comment;
import com.matildaerenius.entity.User;
import com.matildaerenius.service.CommentService;
import com.matildaerenius.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private UserService userService;


    @PostMapping("/api/comments/post/{postId}")
    public Comment createComment(
            @RequestBody Comment comment,
            @RequestHeader("Authorization")String jwt,
            @PathVariable("postId") Integer postId) throws Exception {
        User user = userService.findUserByJwt(jwt);

        Comment createdComment = commentService.createComment(comment,postId,user.getId());

        return createdComment;
    }

    @PutMapping("/api/comments/like/{commentId}")
    public Comment likeComment(
            @RequestHeader("Authorization")String jwt,
            @PathVariable Integer commentId) throws Exception {

        User user = userService.findUserByJwt(jwt);

        Comment likedComment = commentService.likeComments(commentId,user.getId());

        return likedComment;
    }
}
