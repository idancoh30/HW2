/**
 * Represents an accurate-clock with hours, minutes, and seconds.
 */
public class AccurateClock extends Clock {
    private int seconds;

    /**
     * Constructor. Initializes a new accurate-clock and sets time to hours:minutes:seconds using Clock's constructor.
     * @param hours - hours of the new clock.
     * @param minutes - minutes of the new clock.
     * @param seconds - second of the new clock.
     */
    public AccurateClock(int hours, int minutes, int seconds) {
        super(hours, minutes);
        if (seconds < 0 || seconds > 59) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    /**
     * Default constructor. Initializes a new clock and sets time to 00:00:00 using Clock's default constructor.
     */
    public AccurateClock(){
        super();
        this.seconds=0;
    }

    /**
     * Returns a string representation of the hour by HH:MM:SS template.
     * @return string representation of the hour by HH:MM:SS template.
     */
    @Override
    public String toString(){
        if((seconds - 10) < 0)
            return super.toString() + ":0"+seconds;
        return super.toString() + ":"+seconds;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Implements an equivalence relation on non-null object references.
     * @param other - the reference object with which to compare.
     * @return true if this object is the same as the other argument; false otherwise.
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AccurateClock)) {
            return false;
        }
        AccurateClock otherClock = (AccurateClock) other;
        return super.equals(otherClock) && this.seconds == otherClock.seconds;
    }

    /**
     * Returns a hashCode value for the object.
     * @return a hashCode value for the object.
     */
    @Override
    public int hashCode() {
        return super.hashCode()*60+seconds;
    }
}

