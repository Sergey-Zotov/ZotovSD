package test.homework.lesson12.task1.XML;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XmlDeserializationTest extends XmlTest {

    @Test
    @DisplayName("Проверка сериализации объекта")
    void serializationTest() throws IOException {

        String actualHouseXml = XML_HELPER.serialize(HOUSE);
        String expectedHouseXml = Files.readAllLines(Paths.get(EXPECTED_XML)).get(0);

        Assertions.assertEquals(expectedHouseXml, actualHouseXml);
    }
}
