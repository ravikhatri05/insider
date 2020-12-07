package byjus.service;

public interface IClient<I> {
   public void start(String process_id, long time_stamp);
   public void end(String process_id, long time_stamp);
   public I poll();
}
