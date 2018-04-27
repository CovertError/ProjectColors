import java.time.Duration;
import java.time.Instant;

public class StopWatch {
    /**
     * Stop watch class to find the time elapsed
     * @authors: Sira, Omar
     * @version 15.0
     */
    public Instant startTime, endTime;
    public Duration duration;
    public boolean isRunning = false;

    public void start() {
        /**
         * Start Method
         * To Start the StopWatch/Timer
         */
        if (isRunning) {//check if a stop watch is already running.
            throw new RuntimeException("Stopwatch is already running.");
        }
        isRunning = true;
        startTime = Instant.now();//setting the startTime to the current time
    }

    public int stop() {
        /**
         * Stop Method
         * To Stop the StopWatch/Timer
         */
        endTime = Instant.now();
        if (!isRunning) {
            throw new RuntimeException("Stopwatch has not been started yet");
        }
        isRunning = false;
        Duration result = Duration.between(startTime, endTime);
        if (duration == null) {
            duration = result;
        } else {
            duration = duration.plus(result);
        }

        return this.getElapsedTime();
    }

    public int getElapsedTime() {
        /**
         * Time Elapsed Method
         * getter method to get the time
         */
        int timeE=(int) duration.getSeconds();
        return timeE;
    }

    public void reset() {
        /**
         * reset Method
         * To Rest the StopWatch/Timer
         */
        if (isRunning) {
            stop();
        }
        duration = null;
    }
}