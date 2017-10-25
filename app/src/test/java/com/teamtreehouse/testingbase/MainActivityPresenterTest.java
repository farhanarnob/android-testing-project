package com.teamtreehouse.testingbase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */
@RunWith(MockitoJUnitRunner.class)
public class MainActivityPresenterTest {
    MainActivityPresenter mainActivityPresenter;

    @Mock
    MainActivityView mockView;

    @Before
    public void setUp() throws Exception {

        mainActivityPresenter = new MainActivityPresenter(mockView);

    }

    @Test
    public void editTextUpdated() throws Exception {
        // Arrange
        String givenText = "HelloAbc";

        // Act

        mainActivityPresenter.editTextUpdated(givenText);

        // Assert
        Mockito.verify(mockView).changTextViewText(givenText);

    }

    @Test
    public void colorSelected() throws Exception {

    }

    @Test
    public void launchOtherActivityButtonClick() throws Exception {

    }



}