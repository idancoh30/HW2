/**
 * Represents a clock with hours and minutes.
 */
public class Clock {
    private int hours, minutes;

    /**
     * Constructor. Initializes a new clock and sets time to hours:minutes.
     * @param hours - hours of the new clock.
     * @param minutes - minutes of the new clock.
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
     * Default constructor. Initializes a new clock and sets time to 00:00.
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
     * Indicates whether some other object is "equal to" this one.
     * Implements an equivalence relation on non-null object references.
     * @param other - the reference object with which to compare.
     * @return true if this object is the same as the other argument; false otherwise.
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Clock)) {
            return false;
        }
        return this.toString().equals(other.toString());
    }


    /**
     * Returns a hashCode value for the object.
     * @return a hashCode value for the object.
     */
    @Override
    public int hashCode() {
        return 60 * hours + minutes;
    }
}