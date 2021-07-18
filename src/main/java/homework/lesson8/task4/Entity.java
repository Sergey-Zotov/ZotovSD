package homework.lesson8.task4;

import java.util.Objects;

public abstract class Entity implements Validatable {

    protected String uuid;
    protected String name;

    public String getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return name.equals(entity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Entity setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public Entity(String name) {
        this.name = name;
    }

    @Override
    public void validate() {
        ValidatorStub.validateEntity(this);
    }
}
