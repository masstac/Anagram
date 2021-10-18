package com.foxminded.vladbaranchuk.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class generationStringExpandText_shouldReturnWords_whenInputSeveralWordsWithSymbols {
    @Test
    void generationStringExpandText() {
        LogicLineReversal test = new LogicLineReversal();
        String actual = test.validation("#Hel#lo# #w#orld#");
        String expected = "#oll#eH# #d#lrow#";
        assertEquals(expected, actual);
    }
}
