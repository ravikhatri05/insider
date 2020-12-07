package byjus.comparator;
import byjus.model.Log;
import java.util.Comparator;

public class LogComparator implements Comparator<Log> {

    @Override
    public int compare(Log o1, Log o2) {
        return o1.getStartTime().compareTo(o2.getStartTime());
    }
}
