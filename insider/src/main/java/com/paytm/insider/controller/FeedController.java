package com.paytm.insider.controller;

import com.paytm.insider.model.Comments;
import com.paytm.insider.model.Story;
import com.paytm.insider.services.CommentsService;
import com.paytm.insider.services.StoryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Set;

@Controller
public class FeedController {

    @Autowired
    StoryService storyService;

    @Autowired
    CommentsService commentsService;


    @GetMapping("/top-stories")
    public ResponseEntity<List<Story>> getTopStories(){
        return ResponseEntity.ok(storyService.getTopStory());
    }

    @GetMapping("/comments/{storyId}")
    public ResponseEntity<List<Comments>> getTopStories(@PathVariable String storyId ){
        return ResponseEntity.ok(commentsService.getTopComments(storyId));
    }

    @GetMapping("/past-stories")
    public ResponseEntity<Set<Story>> getPastStories(){
        return ResponseEntity.ok(storyService.getAllStory());
    }

}
