public class Time {
    int hour;
    int minute;
    int second;

    public Time() {
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour,int minute,int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time nextSecond(){
        this.second += 1;
        return this;
    }
    public Time previousSecond(){
        this.second -= 1;
        return this;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        if((hour<0 || hour>24)&&(minute<0 || minute>60)&&(second<0 || second>60)){
            return "wrong input";
        }
        if(hour<10){
            sb.append("0").append(hour);
        }else {
            sb.append(hour);
        }
        if(minute<10){
            sb.append(":0").append(minute);
        }else {
            sb.append(":").append(minute);
        }
        if(second<10){
            sb.append(":0").append(second);
        }else {
            sb.append(":").append(second);
        }
        sb.append("]");
        return sb.toString();
    }

}
