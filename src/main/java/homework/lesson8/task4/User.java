package homework.lesson8.task4;

import java.util.Objects;

public class User extends Entity {

    private String jobTitle;

    public User(String name, String jobTitle) {
        super(name);
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(jobTitle, user.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jobTitle);
    }

    @Override
    public String toString() {
        return "User{" +
                "jobTitle='" + jobTitle + '\'' +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
