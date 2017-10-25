package com.teamtreehouse.testingbase;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */

public interface MainActivityView {
    void changTextViewText(String text);

    void changeBackgroundColor(int color);

    void launchOtherActivity(Class activity);
}
