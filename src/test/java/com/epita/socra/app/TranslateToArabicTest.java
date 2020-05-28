package com.epita.socra.app;

import org.junit.Test;

import static org.junit.Assert.*;


import com.epita.socra.app.tools.ArabicTranslater;

public class TranslateTest {
    @Test
    public void given_XLII_returns42()
    {
        assertEquals("42", ArabicTranslater.Translate("XLIII"));
    }
    @Test
    public void given_X_returns10()
    {
        assertEquals("10", ArabicTranslater.Translate("X"));
    }
    @Test
    public void given_LXXXIII_returns83()
    {
        assertEquals("83", ArabicTranslater.Translate("LXXXIII"));
    }
    @Test
    public void given_CMXCIX_returns999()
    {
        assertEquals("999", ArabicTranslater.Translate("CMXCIX"));
    }
}
