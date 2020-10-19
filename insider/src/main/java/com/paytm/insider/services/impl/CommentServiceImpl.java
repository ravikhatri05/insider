package com.paytm.insider.services.impl;

import com.paytm.insider.clients.HMApi;
import com.paytm.insider.model.Comments;
import com.paytm.insider.repository.impl.InMemoryDB;
import com.paytm.insider.services.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentsService {

    @Value("${hm.api.batch_size}")
    Integer batchSize;

    @Autowired
    InMemoryDB inMemoryDB;

    @Autowired
    HMApi hmApi;

    @Override
    public List<Comments> getTopComments(List<Integer> commentIds) {
        List<Comments> comments = commentIds.stream().map(item->hmApi.getComments(item)).collect(Collectors.toList());
        return comments.stream().sorted().limit(batchSize).collect(Collectors.toList());
    }

    @Override
    public List<Comments> getTopComments(String storyId) {
        return inMemoryDB.getComments(storyId);
    }

    @Override
    public void save(String storyId, List<Comments> comment) {
        inMemoryDB.addComments(storyId,comment);
    }
}
