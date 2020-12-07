package com.atlassian.interviews;

import com.atlassian.interviews.service.DataStoreService;
import com.atlassian.interviews.service.impl.DataServiceImpl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public class RateLimiterService {


    /**
     * peroform the rate limit for the provided customer id
     *  return True if allowed
     * @param customerId
     * @return
     */
    public boolean rateLimit(int customerId) {
        Date date = new Date();                      // timestamp now
        Calendar cal = Calendar.getInstance();       // get calendar instance
        cal.setTime(date);
        int second = (cal.get(Calendar.SECOND) / 10) * 10;// set cal to date
        cal.set(Calendar.SECOND, second);                 // set second in minute
        Long timestamp = cal.getTimeInMillis();
        DataStoreService dts =new DataServiceImpl();
       return dts.isThrottlingRequired(customerId,timestamp);
    }
}
