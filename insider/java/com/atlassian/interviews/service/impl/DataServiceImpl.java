package com.atlassian.interviews.service.impl;

import com.atlassian.interviews.service.DataStoreService;

public class DataServiceImpl implements DataStoreService {


    @Override
    public boolean isThrottlingRequired(int customerId, Long timeStamp) {
        return false;
    }

    @Override
    public void resetTimer() {

    }
}
