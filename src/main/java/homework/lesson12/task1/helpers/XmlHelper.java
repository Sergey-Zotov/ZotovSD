package homework.lesson12.task1.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import homework.lesson12.task1.model.Generatable;

public class XmlHelper implements SerializeHelper {
    @Override
    public Generatable deserialize(String data, Class clazz) {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            return (Generatable) xmlMapper.readValue(data, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Не возможно десериализовать обьект.");
        }
    }

    @Override
    public String serialize(Generatable object) {

        XmlMapper xmlMapper = new XmlMapper();
        try {
            return xmlMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Не возможно сериализовать объект.");
        }
    }
}
