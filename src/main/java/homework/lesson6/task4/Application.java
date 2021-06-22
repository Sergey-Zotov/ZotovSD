package homework.lesson6.task4;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        Set<Person> persons = new HashSet<>();
        for (int i = 0; i < 500; i++) {
            persons.add(Person.random());
        }

        Map<IdentityDocumentType, Integer> countDocuments = new HashMap<>();
        for (IdentityDocumentType identityDocumentType : IdentityDocumentType.values()) {
            countDocuments.put(identityDocumentType, 0);
        }

        for (Person person : persons) {
            IdentityDocumentType identityDocumentType = person.getIdentityDocument().getDocumentType();
            countDocuments.put(identityDocumentType, countDocuments.get(identityDocumentType) + 1);
        }

        List<String> documentCodes = new ArrayList<>();
        for (IdentityDocumentType identityDocumentType : IdentityDocumentType.values()) {
            documentCodes.add(identityDocumentType.getCode());
        }
        Collections.sort(documentCodes);
        Collections.reverse(documentCodes);

        for (String code : documentCodes) {
            IdentityDocumentType identityDocumentType = IdentityDocumentType.byCode(code);
            System.out.printf("%s (%s): %d%n", identityDocumentType.getDescription(), code, countDocuments.get(identityDocumentType));
        }

        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (!person.getIdentityDocument().getDocumentType().getCode().equals("21")) {
                iterator.remove();
            }
        }
        System.out.println("Колличество людей после удаления: " + persons.size());
    }


}
