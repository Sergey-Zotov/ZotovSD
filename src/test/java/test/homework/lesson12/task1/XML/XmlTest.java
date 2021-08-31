package test.homework.lesson12.task1.XML;

import homework.lesson12.task1.helpers.XmlHelper;
import homework.lesson12.task1.model.House;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XmlTest {

    protected final XmlHelper XML_HELPER = new XmlHelper();
    protected final House HOUSE = new House().generate();
    protected final String EXPECTED_XML = "src/main/java/homework/lesson12/task1/expected_xml.txt";
    protected final String FLAT_XML = "src/main/java/homework/lesson12/task1/flat.xml";
    protected final String HOUSE_XML = "src/main/java/homework/lesson12/task1/house.xml";
    protected final String ROOM_XML = "src/main/java/homework/lesson12/task1/room.xml";

    protected static String xml(String s) throws IOException {
        return String.join("", Files.readAllLines(Paths.get(s)));
    }
}
