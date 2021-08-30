package homework.lesson11.task4;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileHelper {

    public static List<Person> getPersonsFromExcel(String path, String sheetName) {

        List<Person> people = new ArrayList<>();
        try (FileInputStream file = new FileInputStream(new File(path))) {
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheet(sheetName);
            for (Row row : sheet) {
                try {
                    String lastName = row.getCell(0).getStringCellValue();
                    String firstName = row.getCell(1).getStringCellValue();
                    String patronymic = row.getCell(2).getStringCellValue();
                    SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy");
                    Date birthDate = date.parse(row.getCell(3).getStringCellValue());
                    String series = row.getCell(4).getStringCellValue();
                    String number = row.getCell(5).getStringCellValue();
                    Passport passport = new Passport(series, number);
                    Person person = new Person(lastName, firstName, patronymic, birthDate, passport);
                    people.add(person);
                } catch (RuntimeException | ParseException e) {
                }
            }
        } catch (Throwable e) {
            return null;
        }
        return people;
    }
}
