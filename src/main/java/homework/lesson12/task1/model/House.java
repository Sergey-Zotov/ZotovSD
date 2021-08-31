package homework.lesson12.task1.model;

import java.util.Arrays;
import java.util.List;

public class House implements Generatable {

    private List<Flat> flats;

    public House() {
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public House(List<Flat> flats) {
        this.flats = flats;
    }

    @Override
    public House generate() {
        this.flats = Arrays.asList(
                new Flat().generate(),
                new Flat().generate(),
                new Flat().generate(),
                new Flat().generate(),
                new Flat().generate()
        );
        return this;
    }
}
