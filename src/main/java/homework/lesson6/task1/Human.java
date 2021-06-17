package homework.lesson6.task1;

public class Human {
    private String lastName;
    private String firstName;
    private int age;
    private String phoneNumber;

    public Human(String lastName, String firstName, String phoneNumber, int age) {
        this.age = age;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
    }

    public Human setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Human setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public Human setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
