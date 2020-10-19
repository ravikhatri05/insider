package com.paytm.insider.repository.impl;

import com.paytm.insider.model.Comments;
import com.paytm.insider.model.Story;
import com.paytm.insider.repository.IInMemoryDB;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryDB implements IInMemoryDB {

    private static Map<String, List<Comments>> STORY_TO_COMMENTS_MAPPING =new ConcurrentHashMap<>();
    private static TreeSet<Story> stories = new TreeSet<>();

    @Override
    public void addStory(Story story) {
        stories.add(story);
    }

    @Override
    public void addComments(String storyId, List<Comments> comments) {
        STORY_TO_COMMENTS_MAPPING.put(storyId,comments);
    }

    @Override
    public TreeSet<Story> getStories(){
        return stories;
    }

    @Override
    public List<Comments> getComments(String storyId){
        return STORY_TO_COMMENTS_MAPPING.get(storyId);
    }

    @Override
    public Map<String, List<Comments>>  getStoriesToCommentsMapping(){
        return STORY_TO_COMMENTS_MAPPING;
    }

}
