package com.lmis.app.mobile.events;

/**
 * Pub/Sub event used to communicate between fragment and activity.
 * Subscription occurs in the {@link com.lmis.app.mobile.support.activity.MainActivity}
 */
public class NavItemSelectedEvent {
    private int itemPosition;

    public NavItemSelectedEvent(int itemPosition) {
        this.itemPosition = itemPosition;
    }

    public int getItemPosition() {
        return itemPosition;
    }
}
