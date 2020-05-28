package com.epita.socra.app;

import com.epita.socra.app.tools.ArabicTranslater;
import com.epita.socra.app.tools.Translater;
import org.junit.Test;

import static org.junit.Assert.*;

public class TranslateToArabicTest {
    @Test
    public void given_XLII_returns42()
    {
        ArabicTranslater test = new ArabicTranslater();
        String result = test.Translate("XLII");
        assertEquals("42", result);
    }
    @Test
    public void given_X_returns10()
    {
        ArabicTranslater test = new ArabicTranslater();
        assertEquals("10", test.Translate("X"));
    }
    @Test
    public void given_LXXXIII_returns83()
    {
        ArabicTranslater test = new ArabicTranslater();
        assertEquals("83", test.Translate("LXXXIII"));
    }
    @Test
    public void given_CMXCIX_returns999()
    {
        ArabicTranslater test = new ArabicTranslater();
        assertEquals("999", test.Translate("CMXCIX"));
    }
}
