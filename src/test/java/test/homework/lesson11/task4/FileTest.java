package test.homework.lesson11.task4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {

    protected Date fromString(String parse) throws ParseException {
        return new SimpleDateFormat("dd.MM.yyyy").parse(parse);
    }
}
