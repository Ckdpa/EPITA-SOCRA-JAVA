package com.epita.socra.app;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.RomanTranslater;

public class TranslateToRomanTest {

    @Test
    public void given42_returnsXLII(){
        RomanTranslater test = new RomanTranslater();
        assertEquals("XLII", test.Translate("42"));
    }

    //test 10, 83, 1903, 999, 2999
    @Test
    public void given10_returnsX() {
        RomanTranslater test = new RomanTranslater();
        assertEquals("X", test.Translate("10"));
    }

    @Test
    public void given83_returnsLXXXIII(){
        RomanTranslater test = new RomanTranslater();
        assertEquals("LXXXIII", test.Translate("83"));
    }
    @Test
    public void given1903_returnsMCMII(){
        RomanTranslater test = new RomanTranslater();
        assertEquals("MCMIII", test.Translate("1903"));
    }
    @Test
    public void given999_returnsCMXCIX(){
        RomanTranslater test = new RomanTranslater();
        assertEquals("CMXCIX", test.Translate("999"));
    }
}
