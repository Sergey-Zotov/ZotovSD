package homework.lesson10.task1;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws IOException {
        File input = new File("src/main/java/homework/lesson10/task1/input.txt");
        File output = new File("src/main/java/homework/lesson10/task1/output.txt");

        Map<String, String> content = FileHelper.readFile(input);

        FileHelper.saveFile(output, content);
    }
}
