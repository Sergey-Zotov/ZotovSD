package homework.lesson10.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileHelper {

    public static Map<String, String> readFile(File file) throws IOException {
        List<String> input = Files.readAllLines(Paths.get(file.getAbsolutePath()));
        Map<String, String> result = new HashMap<>();
        for (String line : input) {
            String key = line.split("=")[0];
            if (line.split("=").length == 1) {
                String value = "[]";
                result.put(key, value);
                continue;
            }
            String value = parse(line.split("=")[1]);
            result.put(key, value);
        }
        return result;
    }

    private static String parse(String string) {
        String result = "\"" + string + "\"";
        if (string.equals("null")) return null;
        if (string.equals("true")) return string;
        if (string.equals("false")) return string;
        if (string.contains(".")) {
            try {
                return String.valueOf(Double.parseDouble(string));
            } catch (NumberFormatException e) {
                return result;
            }
        }
        try {
            return String.valueOf(Long.parseLong(string));
        } catch (NumberFormatException e) {
            return result;
        }
    }

    public static void saveFile(File file, Map<String, String> content) {
        StringBuilder sb = new StringBuilder("{");
        sb.append(System.lineSeparator());
        for (Map.Entry<String, String> entry : content.entrySet()) {
            sb.append(String.format("  \"%s\": %s,%n", entry.getKey(), entry.getValue()));
        }
        int lastComma = sb.lastIndexOf(",");
        sb.replace(lastComma, lastComma + 1, "");
        sb.append("}");
        String output = sb.toString();
        System.out.println(output);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(output);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}