package com.lmis.app.mobile.addons.timer;

public class TimerPausedEvent {

    private final boolean timerIsPaused;

    public TimerPausedEvent(boolean timerIsPaused) {
        this.timerIsPaused = timerIsPaused;
    }

    public boolean isTimerIsPaused() {
        return timerIsPaused;
    }
}
