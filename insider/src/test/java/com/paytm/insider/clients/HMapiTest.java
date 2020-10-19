package com.paytm.insider.clients;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HMapiTest {

    @Autowired
    HMApi hmApi;

    @Test
    public void test(){
        hmApi.getTopStories();
    }
}
