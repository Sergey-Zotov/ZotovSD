package homework.lesson11.task3;

import java.util.Random;

public class Generator {

    public static Integer randomInteger(int start, int end) {
        return new Random().nextInt(end - start + 1) + start;
    }

    public static String randomString(int startLength, int endLength) {
        String result = "";
        int length = new Random().nextInt(endLength - startLength + 1) + startLength;
        for (int i = 0; i < length; i++) {
            result += letter();
        }
        return result;
    }

    private static char letter() {
        String line = "ЙЦУКЕНГШЩЗХЪЭЖДЛОРПАВЫФЯЧСМИТЬБЮюбьтимсчяфывапролджэъхзщшгнекуцй";
        return line.charAt(new Random().nextInt(line.length()));
    }
}
