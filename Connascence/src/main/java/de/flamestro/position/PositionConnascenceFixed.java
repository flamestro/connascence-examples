package de.flamestro.position;

public class PositionConnascenceFixed {

    record Hour(int value) { }

    record Minute(int value) { }

    record Second(int value) { }

    static class Time {
        Hour hour;
        Minute minute;
        Second second;

        public Time(Hour hour, Minute minute, Second second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public PositionConnascenceFixed() {
        var time = new Time(new Hour(12), new Minute(12), new Second(12));
    }
}



