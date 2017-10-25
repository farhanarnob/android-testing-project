package com.teamtreehouse.testingbase;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */
public class MainActivityPresenterTest {
    MainActivityPresenter mainActivityPresenter;
    MockView mockView;

    @Before
    public void setUp() throws Exception {
        mockView = new MockView();
        mainActivityPresenter = new MainActivityPresenter(mockView);

    }

    @Test
    public void editTextUpdated() throws Exception {
        // Arrange
        String givenText = "HelloAbc";

        // Act

        mainActivityPresenter.editTextUpdated(givenText);

        // Assert

        assertEquals(givenText, mockView.textViewText);
    }

    @Test
    public void colorSelected() throws Exception {

    }

    @Test
    public void launchOtherActivityButtonClick() throws Exception {

    }

    private class MockView implements MainActivityView {

        String textViewText;

        @Override
        public void changTextViewText(String text) {
            textViewText = text;
        }

        @Override
        public void changeBackgroundColor(int color) {

        }

        @Override
        public void launchOtherActivity(Class activity) {

        }
    }

}