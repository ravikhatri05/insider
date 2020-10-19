package com.paytm.insider.repository;

import com.paytm.insider.model.Comments;
import com.paytm.insider.model.Story;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public interface IInMemoryDB {

    void addStory(Story story);

    void addComments(String storyId, List<Comments> comments);

    TreeSet<Story> getStories();

    List<Comments> getComments(String storyId);

    Map<String, List<Comments>> getStoriesToCommentsMapping();
}
