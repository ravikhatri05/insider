package com.atlassian.interviews.datamodel;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class DataStore {

    /**
     * @Param
     * customerId,
     * timestamp//
     * counter//
     *
     *
     * Don't save older data
     * 9:20:12
     *
     * 2.  9:20:22  30th
     */
    private ConcurrentHashMap<Integer, ConcurrentHashMap<Integer,Long>> rateMap ;



    public DataStore(){
        rateMap= new ConcurrentHashMap<>();
    }

    public void putInCache(int customerId,Long timestamp) {
        if(rateMap.containsKey(customerId)){
            ConcurrentHashMap map=rateMap.get(customerId);
            if(map.containsKey(timestamp)){
                map.put(timestamp,(Long)map.get(timestamp)+1);
            }else {
                ConcurrentHashMap<Integer,Long> map2 =new ConcurrentHashMap<>();
                map2.put(timestamp.intValue(),1l);
            }
        }
    }






}
