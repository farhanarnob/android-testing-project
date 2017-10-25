package com.teamtreehouse.testingbase;

import android.view.inputmethod.EditorInfo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */
public class MainActivityTest {
    MainActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = new MainActivity();
        activity.onCreate(null);
    }

    @Test
    public void editTextUpdatesTextView() throws Exception {
        // Arrange
        String givenString = "test123";
        activity.editText.setText(givenString);
        // Act
        activity.editText.onEditorAction(EditorInfo.IME_ACTION_DONE);

        // Assert

        String actualString = (String) activity.textView.getText();
        assertEquals(givenString, actualString);
    }

}