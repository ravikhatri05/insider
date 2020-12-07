package byjus;
import byjus.model.Log;
import byjus.service.IClient;
import byjus.serviceImpl.LogClient;

public class Main {

    public static void main(String arg[]){
        IClient<Log> client = new LogClient();
        client.start("1",909090);
        client.end("1",9090902);
        System.out.println(client.poll().toString());
    }
}
