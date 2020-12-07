package com.atlassian.interviews.service;

public interface DataStoreService {

    public boolean isThrottlingRequired(int customerId,Long timeStamp);

    public void resetTimer();
}
