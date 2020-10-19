package com.paytm.insider.scheduler;

import com.paytm.insider.services.CommentsService;
import com.paytm.insider.services.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class HmScheduler {

    @Autowired
    StoryService storyService;
    @Autowired
    CommentsService commentsService;

    @Scheduled(fixedDelayString = "${hm.scheduler.delay.milliseconds}", initialDelay = 0)
    public void getTopStoriesAndComments() {
        storyService.getTopStoryLive().stream().forEach(story -> {
            storyService.save(story);
            commentsService.save(story.getId().toString(),
            commentsService.getTopComments(story.getKids()));

        });
        long now = System.currentTimeMillis() / 1000;
        System.out.println(
                "Fixed rate task with one second initial delay - " + now);
    }
}
