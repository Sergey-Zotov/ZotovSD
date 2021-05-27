package homework.lesson4.task3.workers;

public class ServiceDesk {

    private static int countTicket = 0;

    public static void createTicket(String description) {
        System.out.printf("Заявка %d была создана: %s%n", ++countTicket, description);
        if (description.matches("^.*((справк)|(отчет)|(бюджет)).*$")) {
            Accountant.takeTicket(countTicket);
            return;
        } else if (description.matches("^.*((доставк)|(курьер)).*$")) {
            Logistician.takeTicket(countTicket);
            return;
        } else if (description.matches("^.*((компьютер)|(сервер)|(принтер)).*$")) {
            SysAdmin.takeTicket(countTicket);
            return;
        } else if (description.matches("^.*(уборк).*$")) {
            Cleaner.takeTicket(countTicket);
            return;
        } else
            takeTicket();
    }

    private static void takeTicket() {
        System.out.printf("Специалист по выполнению заявки %d не найден%n", countTicket);
    }
}
