package test.homework.lesson14;

import homework.lesson14.helpers.JsonHelper;
import homework.lesson14.helpers.PersonFilterHelper;
import homework.lesson14.model.Card;
import homework.lesson14.model.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class JsonPathTest {

    protected List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/homework/lesson14/dataset.json");

    List<Person> persons20 = PersonFilterHelper.getFilteredPersons();

    protected boolean isCardActive(Card card) {
        try {
            Date cardDate = new SimpleDateFormat("MM.yy").parse(card.getEndDateMonth() + "." + card.getEndDateYear());
            return cardDate.after(new Date());
        } catch (ParseException exception) {
            throw new RuntimeException();
        }
    }
}