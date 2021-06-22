package homework.lesson6.task4;

import java.util.Random;

public class IdentityDocument {

    private IdentityDocumentType documentType;
    private String seriesNumber;

    IdentityDocument(IdentityDocumentType documentType, String seriesNumber) {
        this.documentType = documentType;
        this.seriesNumber = seriesNumber;
    }

    public IdentityDocumentType getDocumentType() {
        return documentType;
    }

    public String getSeriesNumber() {
        return seriesNumber;
    }

    public static IdentityDocument random() {
        IdentityDocumentType documentType = IdentityDocumentType.values()[new Random().nextInt(IdentityDocumentType.values().length)];
        String seriesNumber = StringGenerator.generator(documentType);
        return new IdentityDocument(documentType, seriesNumber);
    }
}
