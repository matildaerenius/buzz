package com.matildaerenius.service;

import com.matildaerenius.models.Story;
import com.matildaerenius.models.User;

import java.util.List;

public interface StoryService {

    public Story createStory (Story story, User user);

    public List<Story> findStoryByUserId (Integer userId) throws Exception;



}
