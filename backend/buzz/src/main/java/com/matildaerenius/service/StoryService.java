package com.matildaerenius.service;

import com.matildaerenius.entity.Story;
import com.matildaerenius.entity.User;

import java.util.List;

public interface StoryService {

    public Story createStory (Story story, User user);

    public List<Story> findStoryByUserId (Integer userId) throws Exception;



}
