package OOP;

public class Clock {
    int hour, minutes, seconds;
    boolean format24;

    public Clock(int hour, int minutes, int seconds, boolean format24) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
        this.format24 = format24;
    }


    void tick(){
        seconds++;
        if (seconds == 60){
            minutes ++;
            seconds = 0;
        }
        if (minutes == 60){
            hour++;
            minutes = 0;
        }
        if (format24 && hour == 24){
            hour = 0;
        } else if(hour == 13 && !format24){
                hour = 1;
            }
    }

}
