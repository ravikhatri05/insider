package com.paytm.insider.services;

import com.paytm.insider.model.Story;

import java.util.List;
import java.util.Set;

public interface StoryService {
    List<Story> getTopStoryLive();

    List<Story> getTopStory();

    Set<Story> getAllStory();

    void save(Story story);
}
