package com.teamtreehouse.testingbase;

import android.graphics.Color;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */

public class MainActivityPresenter {
    MainActivityView view;

    public MainActivityPresenter(MainActivityView view) {
        this.view = view;
    }

    public void editTextUpdated(String text) {
        view.changTextViewText(text);
    }

    public void colorSelected(int index) {
        switch (index) {
            case 0:
                view.changeBackgroundColor(Color.WHITE);
                break;
            case 1:
                view.changeBackgroundColor(Color.MAGENTA);
                break;
            case 2:
                view.changeBackgroundColor(Color.GREEN);
                break;
            case 3:
                view.changeBackgroundColor(Color.CYAN);
                break;
        }
    }

    public void launchOtherActivityButtonClick(Class activity) {
        view.launchOtherActivity(activity);
    }
}
