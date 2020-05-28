package com.epita.socra.app;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void givenAMock_WhenRunningMain_WithArabicInput_ThenCheckOuputs() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("Arabic")
            .thenReturn("45")
            .thenReturn("quit");
        App app = new App(mock);
        app.run();

        verify(mock).write(argThat(message -> message.contains("XLV")));
    }

    @Test
    public void givenAMock_WhenRunningMain_WithRomanInput_ThenCheckOuputs() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("Roman")
            .thenReturn("XDV")
            .thenReturn("quit");
        App app = new App(mock);
        app.run();

        verify(mock).write(argThat(message -> message.contains("45")));
    }

    @Test
    public void givenAMock_WhenRunningMain_WithRomanInput_ThenArabicInput_ThenCheckOuputs() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("Roman")
            .thenReturn("XDV")
            .thenReturn("Arabic")
            .thenReturn("45")
            .thenReturn("quit");
        App app = new App(mock);
        app.run();

        verify(mock).write(argThat(message -> message.contains("45")));

        verify(mock).write(argThat(message -> message.contains("XDV")));
    }
}
