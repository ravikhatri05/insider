package com.paytm.insider.services.impl;

import com.paytm.insider.clients.HMApi;
import com.paytm.insider.model.Story;
import com.paytm.insider.repository.impl.InMemoryDB;
import com.paytm.insider.services.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StoryServiceImpl implements StoryService {

    @Value("${hm.api.batch_size}")
    Integer batchSize;

    @Autowired
    InMemoryDB inMemoryDB;

    @Autowired
    HMApi hmApi;

    @Override
    public List<Story> getTopStoryLive() {
        List<Integer> storiesId = hmApi.getTopStories().stream().limit(batchSize).collect(Collectors.toList());
        return storiesId.stream().map(story -> hmApi.getStory(story)).collect(Collectors.toList());
    }
    @Override
    public List<Story> getTopStory() {
        return inMemoryDB.getStories().stream().limit(batchSize).collect(Collectors.toList());
    }

    @Override
    public Set<Story> getAllStory() {
        return inMemoryDB.getStories();
    }

    @Override
    public void save(Story story) {
        inMemoryDB.addStory(story);
    }
}
