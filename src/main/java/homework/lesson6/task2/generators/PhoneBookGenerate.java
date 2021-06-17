package homework.lesson6.task2.generators;

import homework.lesson6.task2.Chance;
import homework.lesson6.task2.PhoneType;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookGenerate {

    public static Map<PhoneType, String> generate() {
        Map<PhoneType, String> result = new HashMap<>();
        for (int i = 0; i < PhoneType.values().length; i++) {
            if (Chance.calculateChance(20)) {
                result.put(PhoneType.values()[i], PhoneGenerator.generate());
            }
        }
        return result;
    }
}
