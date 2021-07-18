package homework.lesson8.task4;

import java.util.Objects;

public class Client extends Entity {

    private String address;

    @Override
    public String toString() {
        return "Client{" +
                "address='" + address + '\'' +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return address.equals(client.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    public Client(String name, String address) {
        super(name);
        this.address = address;
    }
}
