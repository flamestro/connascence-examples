package de.flamestro.value;

public class ValueConnascenceFixed {

    record Hour(int value) { }

    record Minute(int value) { }

    record Second(int value) { }

    static class Time {
        Hour hour;
        Minute minute;
        Second second;

        public Time(Hour hour, Minute minute, Second second) {
            assert 0 <= second.value && second.value <= 60;
            assert 0 <= minute.value && minute.value <= 60;
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public ValueConnascenceFixed() {
        var time = new Time(new Hour(25), new Minute(62), new Second(80));
    }
}



