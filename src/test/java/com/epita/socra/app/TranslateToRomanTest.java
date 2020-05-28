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
        assertEquals("XLII", RomanTranslater.TranslateToRoman("42"));
    }

    //test 10, 83, 1903, 999, 2999
    @Test
    public void given10_returnsX(){
        assertEquals("X", RomanTranslater.TranslateToRoman("10"));
    }

    @Test
    public void given83_returnsLXXXIII(){
        assertEquals("LXXXIII", RomanTranslater.TranslateToRoman("83"));
    }
    @Test
    public void given1903_returnsMCMII(){
        assertEquals("MCMIII", RomanTranslater.TranslateToRoman("1903"));
    }
    @Test
    public void given999_returnsCMXCIX(){
        assertEquals("CMXCIX", RomanTranslater.TranslateToRoman("999"));
    }
}
