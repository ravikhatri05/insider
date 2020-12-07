package byjus.model;

public class Log {
    String processId;
    Long startTime;
    Long endTime;

    public Log(String processId,long startTime,long endTime){
        this.processId=processId;
        this.startTime=startTime;
        this.endTime=endTime;
    }
    public String getProcessId() {
        return processId;
    }

    public Long getStartTime() {
        return startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setProcessId (String processId){
        this.processId=processId;
    }

    public void setStartTime(long startTime){
        this.startTime=startTime;
    }
    public void setEndTime(long endTime){
        this.endTime=endTime;
    }

    @Override
    public String toString() {
        return "{processId:"+processId+",startTime:"+startTime+",endTime:"+endTime+"}";
    }
}
