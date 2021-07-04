package homework.lesson8.task3;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Terminal> terminals = Arrays.asList(
                new QiwiTerminal("г. Москва, ул. Проходчиков, д.3"),
                new EleksnetTerminal("г. Москва, Измайловский пр-т, 73/2"),
                new EleksnetTerminal("г. Москва, ул. Бакунинская, д.1"),
                new EleksnetTerminal("г. Новосибирск, ул. Героев-Десантников, д. 4"),
                new TinkoffTerminal("г. Москва, Ленинградский пр-т, д. 15")
        );

        for (Terminal terminal : terminals) {
            terminal.pay("+7(906)158-12-52", 1);
            terminal.pay("+7(909)154-56-31", 100);
            terminal.pay("+7(965)856-95-62", 300);
            terminal.pay("+7(910)741-85-96", 600);
            terminal.pay("+7(903)852-95-12", 999);
            terminal.pay("+7(966)456-12-36", 1000);
        }
    }
}
