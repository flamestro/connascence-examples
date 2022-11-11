package de.flamestro.value;

public class ValueConnascence {

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

    public ValueConnascence() {
        var time = new Time(new Hour(25), new Minute(62), new Second(80));
    }
}



