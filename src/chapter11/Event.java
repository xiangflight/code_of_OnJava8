package chapter11;

import java.time.Duration;
import java.time.Instant;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-17 13:50
 */
public abstract class Event {
    private Instant eventTime;

    protected final Duration delayTime;

    public Event(long millisecondDelay) {
        delayTime = Duration.ofMillis(millisecondDelay);
        start();
    }

    public void start() {
        eventTime = Instant.now().plus(delayTime);
    }

    public boolean ready() {
        return Instant.now().isAfter(eventTime);
    }

    public abstract void action();

}
