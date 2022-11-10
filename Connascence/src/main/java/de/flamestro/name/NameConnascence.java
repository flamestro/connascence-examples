package de.flamestro.name;

public class NameConnascence {

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

    public NameConnascence() {
        var time = new Time(12, 12, 12);
    }
}
