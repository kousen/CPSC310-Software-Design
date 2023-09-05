package edu.trinity;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordCountTest {
    @Test
    void testFileNotFound() {
        assertThrows(IOException.class,
                () -> WordCount.countWord("nonexistent.txt", "word"));
    }

    @Test
    void testWordCount() throws IOException {
        // Assuming a file named "test.txt" exists with the content "word test word"
        assertEquals(2, WordCount.countWord("test.txt", "word"));
        assertEquals(1, WordCount.countWord("test.txt", "test"));
    }
}