package com.foxminded.vladbaranchuk.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicLineReversalTest {

    LogicLineReversal test = new LogicLineReversal();

    @Test
    void generationStringExpandText_shouldReturnCharacter_whenInputSingleCharacter() {
        String actual = test.generationStringExpandText("#");
        String expected = "#";
        assertEquals(expected, actual);
    }

    @Test
    void generationStringExpandText_shouldReturnError_whenInputEmptyString() {
        String actual = test.generationStringExpandText("");
        String expected = "FAIL";
        assertEquals(expected, actual);
    }

    @Test
    void generationStringExpandText_shouldReturnError_whenInputNull() {
        String actual = test.generationStringExpandText(null);
        String expected = "FAIL";
        assertEquals(expected, actual);
    }

    @Test
    void generationStringExpandText_shouldReturnError_whenInputOnlySpace() {
        String actual = test.generationStringExpandText(" ");
        String expected = "FAIL";
        assertEquals(expected, actual);
    }

    @Test
    void generationStringExpandText_shouldReturnError_whenInputSeveralSpaces() {
        String actual = test.generationStringExpandText("    ");
        String expected = "FAIL";
        assertEquals(expected, actual);
    }

    @Test
    void generationStringExpandText_shouldReturnLetters_whenInputMultipleLetters() {
        String actual = test.generationStringExpandText("aa");
        String expected = "aa";
        assertEquals(expected, actual);
    }

    @Test
    void generationStringExpandText_shouldReturnLetters_whenInputUpperAndLowerLetters() {
        String actual = test.generationStringExpandText("Aa");
        String expected = "aA";
        assertEquals(expected, actual);
    }

    @Test
    void generationStringExpandText_shouldReturnLetters_whenInputWordWithDifferentLetters() {
        String actual = test.generationStringExpandText("Foxminded");
        String expected = "dednimxoF";
        assertEquals(expected, actual);
    }

    @Test
    void generationStringExpandText_shouldReturnSymbols_whenInputOnlySymbols() {
        String actual = test.generationStringExpandText("#$%");
        String expected = "#$%";
        assertEquals(expected, actual);
    }

    @Test
    void generationStringExpandText_shouldReturnWords_whenInputSeveralWords() {
        String actual = test.generationStringExpandText("Hello world");
        String expected = "olleH dlrow";
        assertEquals(expected, actual);
    }

    @Test
    void generationStringExpandText_shouldReturnWords_whenInputSeveralWordsWithSymbols() {
        String actual = test.generationStringExpandText("#Hel#lo# #w#orld#");
        String expected = "#oll#eH# #d#lrow#";
        assertEquals(expected, actual);
    }
}
