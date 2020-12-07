package byjus.serviceImpl;

import byjus.model.Log;
import byjus.repository.LogPool;
import byjus.service.IClient;

public class LogClient implements IClient<Log> {


    @Override
    public void start(String process_id, long time_stamp) {
        LogPool.add(new Log(process_id,time_stamp,0));
    }

    @Override
    public void end(String process_id, long time_stamp) {
        LogPool.end(new Log(process_id,0,time_stamp));
    }

    @Override
    public Log poll() {
        return LogPool.poll();
    }
}
