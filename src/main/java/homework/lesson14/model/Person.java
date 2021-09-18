package homework.lesson14.model;

import java.util.List;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;
    private Passport passport;
    private List<Propertie> properties;
    private List<Account> accounts;
    private List<Card> cards;

    public Person() {
    }

    public Person(String lastName, String firstName, String patronymic, Passport passport, List<Propertie> properties, List<Account> accounts, List<Card> cards) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.passport = passport;
        this.properties = properties;
        this.accounts = accounts;
        this.cards = cards;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Person setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        return this;
    }

    public Passport getPassport() {
        return passport;
    }

    public Person setPassport(Passport passport) {
        this.passport = passport;
        return this;
    }

    public List<Propertie> getProperties() {
        return properties;
    }

    public Person setProperties(List<Propertie> properties) {
        this.properties = properties;
        return this;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Person setAccounts(List<Account> accounts) {
        this.accounts = accounts;
        return this;
    }

    public List<Card> getCards() {
        return cards;
    }

    public Person setCards(List<Card> cards) {
        this.cards = cards;
        return this;
    }
}
