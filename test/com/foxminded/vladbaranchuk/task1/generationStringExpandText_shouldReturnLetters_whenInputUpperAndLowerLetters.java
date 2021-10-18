package com.foxminded.vladbaranchuk.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class generationStringExpandText_shouldReturnLetters_whenInputUpperAndLowerLetters {
    @Test
    void generationStringExpandText() {
        LogicLineReversal test = new LogicLineReversal();
        String actual = test.validation("Aa");
        String expected = "aA";
        assertEquals(expected, actual);
    }
}
