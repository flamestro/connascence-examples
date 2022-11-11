package de.flamestro.value;

public class ValueConnascenceFixedV2 {

    enum Hour {
        ONE, TWO, THREE //...
    }

    enum Minute {
        ONE, TWO, THREE //...
    }

    enum Second {
        ONE, TWO, THREE //...
    }

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

    public ValueConnascenceFixedV2() {
        var time = new Time(Hour.ONE, Minute.ONE, Second.ONE);
    }
}



