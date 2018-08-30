package MyTask3;

public class Time {
    public static void main(String[] args) {
        TimeLine timeLine1 = new TimeLine(500);
        TimeLine timeLine2 = new TimeLine(50,6,1);
        int total = timeLine2.getInSeconds();
        timeLine2.outputSeconds();
        timeLine1.outputCompareTo(timeLine2);
    }
}
