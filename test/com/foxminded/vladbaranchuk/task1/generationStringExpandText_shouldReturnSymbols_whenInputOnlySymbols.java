package com.foxminded.vladbaranchuk.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class generationStringExpandText_shouldReturnSymbols_whenInputOnlySymbols {
    @Test
    void generationStringExpandText() {
        LogicLineReversal test = new LogicLineReversal();
        String actual = test.validation("#$%");
        String expected = "#$%";
        assertEquals(expected, actual);
    }
}
