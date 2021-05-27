package homework.lesson4.task2;

public class Validator {

    public static Boolean checkingForTwoSpaces(String string) {
        Boolean stringValid = string.matches("^\\S*\\s\\S*\\s\\S*$");
        if (stringValid) {
            System.out.println("Строка соответствует формату");
        } else {
            System.out.println("Строка не соответствует формату");
        }
        return stringValid;
    }

    public static String[] arrayString(String string) {
        String[] strings = string.split(" ");
        System.out.println("Строка разделена на части");
        return strings;
    }

    public static Boolean validHuman(Human human) {
        Boolean validHuman = human.getLastName() != null && human.getFirstName() != null && human.getBirthDate() != null;
        if (validHuman) {
            System.out.println("Все поля заполнены");
        } else {
            System.out.println("Не все поля заполнены");
        }
        return validHuman;
    }

    public static Boolean validHumanArray(Human[] humans) {
        Boolean arrayIsFull = true;
        for (int i = 0; i < humans.length; i++) {
            if (humans[i] == null) {
                arrayIsFull = false;
                break;
            }
        }

        if (arrayIsFull) {
            System.out.println("Массив заполнен");
        } else {
            System.out.println("В массиве есть свободное место");
        }
        return arrayIsFull;
    }
}
