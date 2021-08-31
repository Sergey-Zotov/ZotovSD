package test.homework.lesson12.task1.Json;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonSerializationTest extends JsonTest {

    @Test
    @DisplayName("Сериализация объекта в Json")
    void serializationTest() throws IOException {

        String actualHouseJson = JSON_HELPER.serialize(HOUSE);
        String expectedHouseJson = Files.readAllLines(Paths.get(EXPECTED_JSON)).get(0);

        Assertions.assertEquals(actualHouseJson, expectedHouseJson);
    }
}
