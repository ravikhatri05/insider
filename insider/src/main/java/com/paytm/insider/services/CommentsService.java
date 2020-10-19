package com.paytm.insider.services;

import com.paytm.insider.model.Comments;

import java.util.List;

public interface CommentsService {
    List<Comments> getTopComments(List<Integer> commentIds);
    List<Comments> getTopComments(String storyId);
    void save(String storyId, List<Comments> comment);
}
