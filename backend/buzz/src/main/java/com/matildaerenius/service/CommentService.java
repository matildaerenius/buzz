package com.matildaerenius.service;

import com.matildaerenius.entity.Comment;

public interface CommentService {

    public Comment createComment(Comment comment, Integer postId, Integer userId) throws Exception;

    public Comment findCommentById(Integer commentId) throws Exception;

    public Comment likeComments(Integer CommentId, Integer userId) throws Exception;
}
