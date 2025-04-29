package com.matildaerenius.service;

import com.matildaerenius.models.Story;

import java.util.List;

public interface StoryService {

    public Story createStory (Story story, Integer userId);

    public List<Story> findStoryByUserId (Integer userId);



}
