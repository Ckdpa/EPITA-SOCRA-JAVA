package com.epita.socra.app;

import com.epita.socra.app.tools.Translater;
import org.junit.Test;

import static org.junit.Assert.*;

public class TranslateToArabicTest {
    @Test
    public void given_XLII_returns42()
    {
        String result = Translater.Translate("XLII");
        assertEquals("42", result);
    }
    @Test
    public void given_X_returns10()
    {
        assertEquals("10", Translater.Translate("X"));
    }
    @Test
    public void given_LXXXIII_returns83()
    {
        assertEquals("83", Translater.Translate("LXXXIII"));
    }
    @Test
    public void given_CMXCIX_returns999()
    {
        assertEquals("999", Translater.Translate("CMXCIX"));
    }
}
