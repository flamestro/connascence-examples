package de.flamestro.position;

public class PositionConnascence {

    static class Time{
        int hour;
        int minute;
        int second;

        public Time(int hour, int minute, int second){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public PositionConnascence() {
        var time = new Time(12, 12, 12);
    }
}

