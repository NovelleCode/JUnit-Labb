package se.iths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextProcessorTest {

    @RepeatedTest(5)
    void testAllCaps() {
        TextProcessor textProcessor = new TextProcessor();
            assertEquals("HELLO TO YOU", textProcessor.allCaps("Hello to you"));
    }

    @Test
    void testAllLowerDoesNotEqualAllCaps() {
        TextProcessor textProcessor = new TextProcessor();
        assertFalse(textProcessor.allLower("Hello World").equals("HELLO WORLD"));
    }

    @Test
    @DisplayName("Checking if reverse string method is not null")
    void testReverseNotNull() {
        TextProcessor textProcessor = new TextProcessor();
        assertNotNull(textProcessor.reverse("Hello!"));
    }
}