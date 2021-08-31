package homework.lesson10.task3;

import java.util.List;
import java.util.Properties;

public class FileGen {

    private Integer amount;
    private List<Integer> size;
    private List<String> extensions;
    private Properties properties;

    public FileGen(Integer amount, List<Integer> size, List<String> extensions, Properties properties) {
        this.amount = amount;
        this.size = size;
        this.extensions = extensions;
        this.properties = properties;
    }

}
