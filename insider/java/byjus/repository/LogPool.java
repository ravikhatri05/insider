package byjus.repository;

import byjus.comparator.LogComparator;
import byjus.model.Log;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class LogPool {


    /**
     * startTime
     * end Time
     */
    private  static TreeSet<Log> LOG_POOL = new TreeSet<>(new LogComparator());
    private static HashMap<String,Log> LOG_MAP = new HashMap<>();

    public static void add(Log log){
        LOG_POOL.add(log);
        LOG_MAP.put(log.getProcessId(),log);
    }

    public static void end(Log log){
        LOG_MAP.get(log.getProcessId()).setEndTime(log.getEndTime());
    }

    public static Log poll(){
        Iterator<Log> itr = LOG_POOL.iterator();
        while(itr.hasNext()){
            Log log = itr.next();
            if(log.getEndTime()!=0){
                itr.remove();
                return log;
            }
            break;
        }
        return null;
    }

}
