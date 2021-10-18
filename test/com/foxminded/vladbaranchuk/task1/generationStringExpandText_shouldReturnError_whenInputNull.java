package com.foxminded.vladbaranchuk.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class generationStringExpandText_shouldReturnError_whenInputNull {
    @Test
    void generationStringExpandText() {
        LogicLineReversal test = new LogicLineReversal();
        String actual = test.validation(null);
        String expected = "FAIL";
        assertEquals(expected, actual);
    }
}
