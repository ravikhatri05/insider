package com.paytm.insider.clients;

import com.paytm.insider.model.Comments;
import com.paytm.insider.model.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Component
public class HMApi {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${hm.api.baseurl}")
    private String hmBaseUrl;

    @Value("${hm.topStories}")
    private String topStories;

    @Value("${hm.item.api}")
    String itemUrl;

    public List<Integer> getTopStories(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(hmBaseUrl+topStories, HttpMethod.GET, entity, LinkedList.class).getBody();
    }
    public Story getStory(Integer itemId){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(hmBaseUrl+itemUrl+itemId+".json", HttpMethod.GET, entity, Story.class).getBody();
    }

    public Comments getComments(Integer itemId){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(hmBaseUrl+itemUrl+itemId+".json", HttpMethod.GET, entity, Comments.class).getBody();
    }

}
