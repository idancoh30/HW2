public class AccurateClock extends Clock {
    private int seconds;

    public AccurateClock(int hours, int minutes, int seconds) {
        super(hours, minutes);
        if (seconds < 0 || seconds > 59) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }
    public AccurateClock(){
        super();
        this.seconds=0;
    }

    @Override
    public String toString(){
        if((seconds - 10) < 0)
            return super.toString() + ":0"+seconds;
        return super.toString() + ":"+seconds;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AccurateClock)) {
            return false;
        }
        AccurateClock otherClock = (AccurateClock) other;
        return super.equals(otherClock) && this.seconds == otherClock.seconds;
    }

    @Override
    public int hashCode() {
        return super.hashCode()*60+seconds;
    }

    public int getSeconds() {
        return seconds;
    }
}

