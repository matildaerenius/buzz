package com.matildaerenius.service;

import com.matildaerenius.models.Post;
import com.matildaerenius.models.User;
import com.matildaerenius.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImplementation implements PostService {

    @Autowired
    PostRepository postRepository;
    @Autowired
    UserService userService;

    @Override
    public Post createNewPost(Post post, int userId) throws Exception {

        User user = userService.findUserById(userId);

        Post newPost = new Post();
        newPost.setCaption(post.getCaption());
        newPost.setImage(post.getImage());
//        newPost.setCreatedAt(new LocalDateTime.now());
        newPost.setVideo(post.getVideo());
        newPost.setUser(user);

        return newPost;
    }

    @Override
    public String deletePost(int postId, int userId) throws Exception {
        Post post = findPostById(postId);
        User user = userService.findUserById(userId);

        if(post.getUser().getId()!=user.getId()) {
            throw new Exception("you can't delete another users post");
        }
        postRepository.delete(post);
        return "post deleted successfully";
    }

    @Override
    public List<Post> findPostByUserId(int userId) throws Exception {
        return postRepository.findPostByUserId(userId);
    }

    @Override
    public Post findPostById(int postId) throws Exception {
        Optional<Post> otp = postRepository.findById(postId);
        if (otp.isEmpty()) {
            throw new Exception("post not found with id " + postId);
        }
        return otp.get();
    }

    @Override
    public List<Post> findAllPosts() throws Exception {
        return postRepository.findAll();
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
