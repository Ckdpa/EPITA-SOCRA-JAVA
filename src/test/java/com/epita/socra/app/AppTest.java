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
    public void givenAMock_WhenRunningMain_ThenCheckOuputs() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("Arabic");
        App app = new App(mock);
        app.run();

        when (mock.read()).thenReturn("45");
        verify(mock).write(argThat(message -> message.contains("XDV")));
        when(mock.read()).thenReturn("stop");
    }
}
