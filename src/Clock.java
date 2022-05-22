import java.util.Objects;

/**
 * Represents a clock with hours and minutes.
 */
public class Clock {
    private int hours, minutes;

    /**
     * Initializes a new clock and sets time to hours:minutes.
     * @param hours Hours of the new clock.
     * @param minutes Minutes of the new clock.
     */
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

    /**
     * Initializes a new clock and sets time to 00:00.
     */
    public Clock() {
        this.hours = 0;
        this.minutes = 0;
    }

    /**
     * Returns a string representation of the hour by HH:MM template.
     * @return string representation of the hour by HH:MM template.
     */
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

    /**
     * * @param other
     * @return
     */
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