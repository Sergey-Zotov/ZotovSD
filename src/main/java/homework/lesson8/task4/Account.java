package homework.lesson8.task4;

import java.util.Objects;

public class Account extends Entity {

    private String accountNumber;

    public Account(String name, String accountNumber) {
        super(name);
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        if (!super.equals(o)) return false;
        Account account = (Account) o;
        return accountNumber.equals(account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), accountNumber);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
