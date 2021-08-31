package test.homework.lesson12.task1.XML;

import homework.lesson12.task1.model.Flat;
import homework.lesson12.task1.model.House;
import homework.lesson12.task1.model.Room;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class XmlSerializationTest extends XmlTest {

    @Test
    @DisplayName("Десериализации объекта Room")
    void deserializationRoomTest() throws IOException {
        Room room = (Room) XML_HELPER.deserialize(xml(ROOM_XML), Room.class);

        Assertions.assertEquals(6, room.getWidth());
        Assertions.assertEquals(5, room.getHeight());
    }

    @Test
    @DisplayName("Десериализации объекта Flat")
    void deserializationFlatTest() throws IOException {
        Flat flat = (Flat) XML_HELPER.deserialize(xml(FLAT_XML), Flat.class);

        Assertions.assertEquals(3, flat.getRooms().size());

        Assertions.assertEquals(4, flat.getRooms().get(0).getWidth());
        Assertions.assertEquals(3, flat.getRooms().get(0).getHeight());

        Assertions.assertEquals(6, flat.getRooms().get(1).getWidth());
        Assertions.assertEquals(5, flat.getRooms().get(1).getHeight());

        Assertions.assertEquals(2, flat.getRooms().get(2).getWidth());
        Assertions.assertEquals(3, flat.getRooms().get(2).getHeight());
    }

    @Test
    @DisplayName("Десериализации объекта House")
    void deserializationHouseTest() throws IOException {
        House house = (House) XML_HELPER.deserialize(xml(HOUSE_XML), House.class);

        Assertions.assertEquals(3, house.getFlats().size());

        Assertions.assertEquals(2, house.getFlats().get(0).getRooms().size());
        Assertions.assertEquals(1, house.getFlats().get(1).getRooms().size());
        Assertions.assertEquals(3, house.getFlats().get(2).getRooms().size());

        Assertions.assertEquals(2, house.getFlats().get(0).getRooms().size());

        Assertions.assertEquals(3, house.getFlats().get(0).getRooms().get(0).getWidth());
        Assertions.assertEquals(4, house.getFlats().get(0).getRooms().get(0).getHeight());
        Assertions.assertEquals(4, house.getFlats().get(0).getRooms().get(1).getWidth());
        Assertions.assertEquals(3, house.getFlats().get(0).getRooms().get(1).getHeight());

        Assertions.assertEquals(1, house.getFlats().get(1).getRooms().size());

        Assertions.assertEquals(5, house.getFlats().get(1).getRooms().get(0).getWidth());
        Assertions.assertEquals(6, house.getFlats().get(1).getRooms().get(0).getHeight());

        Assertions.assertEquals(3, house.getFlats().get(2).getRooms().size());

        Assertions.assertEquals(2, house.getFlats().get(2).getRooms().get(0).getWidth());
        Assertions.assertEquals(3, house.getFlats().get(2).getRooms().get(0).getHeight());
        Assertions.assertEquals(3, house.getFlats().get(2).getRooms().get(1).getWidth());
        Assertions.assertEquals(4, house.getFlats().get(2).getRooms().get(1).getHeight());
        Assertions.assertEquals(4, house.getFlats().get(2).getRooms().get(2).getWidth());
        Assertions.assertEquals(8, house.getFlats().get(2).getRooms().get(2).getHeight());
    }
}
