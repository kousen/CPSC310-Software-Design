package edu.trinity;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class WordCount {
    public static long countWord(String filePath, String targetWord) throws IOException {
        try (Stream<String> lines =
                     Files.lines(Paths.get("src/main/resources/", filePath))) {
            return lines
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .filter(word -> word.equalsIgnoreCase(targetWord))
                    .count();
        }
    }
}
