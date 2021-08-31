package test.homework.lesson12.task1.Json;

import homework.lesson12.task1.helpers.JsonHelper;
import homework.lesson12.task1.model.House;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonTest {

    protected final JsonHelper JSON_HELPER = new JsonHelper();
    protected final House HOUSE = new House().generate();
    protected final String EXPECTED_JSON = "src/main/java/homework/lesson12/task1/expected_json.txt";
    protected final String FLAT_JSON = "src/main/java/homework/lesson12/task1/flat.json";
    protected final String HOUSE_JSON = "src/main/java/homework/lesson12/task1/house.json";
    protected final String ROOM_JSON = "src/main/java/homework/lesson12/task1/room.json";

    protected static String json(String s) throws IOException {
        return String.join("", Files.readAllLines(Paths.get(s)));
    }
}
