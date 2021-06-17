package homework.lesson6.task2.generators;

import homework.lesson6.task2.Human;

public class HumanGenerate {

    public static Human generate() {
        return new Human(NameGenerator.generate(), NameGenerator.generate(),
                AgeGenerator.generate(), PhoneBookGenerate.generate());
    }
}
