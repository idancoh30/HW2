import java.util.Objects;

public class Clock {
    private int hours, minutes;

    public Clock(int hours, int minutes) {
        if (hours < 0 || hours > 23)
            this.hours = 0;
        if (minutes < 0 || minutes > 59)
            this.minutes = 0;
        else {
            this.hours = hours;
            this.minutes = minutes;
        }
    }

    public Clock() {
        this.hours = 0;
        this.minutes = 0;
    }

    @Override
    public String toString() {
        String output = "";
        if ((hours - 10) < 0) {
            output += "0" + hours + ":";
        } else {
            output += hours + ":";
        }
        if ((minutes - 10) < 0) {
            output += "0" + minutes;
        } else {
            output += minutes;
        }
        return output;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Clock)) {
            return false;
        }
        return this.toString().equals(other.toString());
    }

    // Count minutes passed from 00:00
    @Override
    public int hashCode() {
        return 60 * hours + minutes;
    }
}