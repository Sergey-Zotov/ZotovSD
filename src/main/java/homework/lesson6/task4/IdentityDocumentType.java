package homework.lesson6.task4;

public enum IdentityDocumentType {
    MILITARY_ID("07", "Военный билет"),
    DIPLOMATIC_PASSPORT("09", "Дипломатичекий пасспорт"),
    FOREIGN_CITIZEN_PASSPORT("10", "Пасспорт иностранного гражданина"),
    RUSSIAN_CITIZEN_PASSPORT("21", "Пасспорт гражданинаРоссийской Федерации"),
    INTERNATIONAL_PASSPORT("22", "Загранпаспорт гражданина Российской Федерации");

    private String code;
    private String description;

    IdentityDocumentType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static IdentityDocumentType byCode(String code) {
        for (IdentityDocumentType identityDocumentType : IdentityDocumentType.values()) {
            if (identityDocumentType.code.equals(code)) {
                return identityDocumentType;
            }
        }
        return null;
    }
}
