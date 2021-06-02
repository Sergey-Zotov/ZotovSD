package homework.lesson4.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Application {

    public static void main(String[] args) throws IOException {
        Human[] humans = new Human[3];
        int index = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        while (true) {
            Boolean validInput = Validator.checkingForTwoSpaces(input);
            if (!validInput) continue;

            String[] arrayFromInput = Validator.arrayString(input);

            Human human = new Human();
            human.setLastName(arrayFromInput[0]);
            human.setFirstName(arrayFromInput[1]);
            human.setBirthDate(LocalDate.parse(arrayFromInput[2], DateTimeFormatter.ofPattern("dd.MM.yyyy")));

            Boolean dataIsValid = Validator.validHuman(human);
            if (!dataIsValid) continue;

            humans[index++] = human;

            Boolean arrayСompletenes = Validator.validHumanArray(humans);
            if (arrayСompletenes) break;
        }
    }
}
