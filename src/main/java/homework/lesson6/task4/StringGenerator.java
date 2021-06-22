package homework.lesson6.task4;

import java.util.Random;

public class StringGenerator {

    private static final String DECIMAL_DIGIT = "0123456789";
    private static final String RUSSIAN_CAPITAL_LETTER = "ЙЦУКЕНГШЩЗХЪЭЖДЛОРПАВЫФЯЧСМИТЬБЮ";
    private static final String RANDOM_SYMBOL = "0123456789QWERTYUIOPLKJHGFDSAZXCVBNM";

    public static String generator(IdentityDocumentType documentType) {
        switch (documentType) {
            case MILITARY_ID:
                return generateMilitaryID();
            case DIPLOMATIC_PASSPORT:
                return generateDiplomaticPassport();
            case FOREIGN_CITIZEN_PASSPORT:
                return generateForeignCitizenPassport();
            case RUSSIAN_CITIZEN_PASSPORT:
                return generateRussianCitizenPassport();
            case INTERNATIONAL_PASSPORT:
                return generateInternationalPassport();
            default:
                throw new IllegalArgumentException("Тип документа отсутствует" + documentType.name());
        }

    }

    private static String generateMilitaryID() {
        return String.format("%s %s%s", stringGenerate(RUSSIAN_CAPITAL_LETTER, 2),
                randomSymbol(DECIMAL_DIGIT, 1), stringGenerate(DECIMAL_DIGIT, 6));
    }

    private static String generateDiplomaticPassport() {
        return String.format("%s %s", stringGenerate(DECIMAL_DIGIT, 2),
                stringGenerate(DECIMAL_DIGIT, 7));
    }

    private static String generateForeignCitizenPassport() {
        return String.format("%s", randomSymbol(RANDOM_SYMBOL, 25));
    }

    private static String generateRussianCitizenPassport() {
        return String.format("%s %s %s", stringGenerate(DECIMAL_DIGIT, 2),
                stringGenerate(DECIMAL_DIGIT, 2), stringGenerate(DECIMAL_DIGIT, 6));
    }

    private static String generateInternationalPassport() {
        return String.format("%s %s", stringGenerate(DECIMAL_DIGIT, 2),
                stringGenerate(DECIMAL_DIGIT, 7));
    }

    private static String stringGenerate(String pattern, int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            result += pattern.charAt(new Random().nextInt(pattern.length()));
        }
        return result;
    }

    private static String randomSymbol(String pattern, int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            int random = new Random().nextInt(101);
            if (random >= 50) {
                result += pattern.charAt(new Random().nextInt(pattern.length()));
            }
        }
        return result;
    }
}
