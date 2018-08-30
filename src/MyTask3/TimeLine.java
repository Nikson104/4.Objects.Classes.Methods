package MyTask3;

public class TimeLine {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeLine(int allSeconds) {
        this.hours = allSeconds / 3600;
        this.minutes = (allSeconds - this.hours * 3600) / 60;
        this.seconds = allSeconds - this.hours * 3600 - this.minutes*60;

    }

    public TimeLine(int seconds, int minutes, int hours) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    int getInSeconds (){
        int total = this.hours*3600+this.minutes*60+this.seconds;
        return total;
    }

    void outputSeconds (){
        System.out.println(getInSeconds());
    }

    int compareTo (TimeLine otherTimeline) {
        if (this.getInSeconds()>otherTimeline.getInSeconds()){
            return 1;
        }
        if (this.getInSeconds()==otherTimeline.getInSeconds()){
            return 0;
        } else {
            return -1;
        }
    }

    void outputCompareTo (TimeLine otherTimeLine){
        int result = this.compareTo(otherTimeLine);
        System.out.println(result);
    }
}
