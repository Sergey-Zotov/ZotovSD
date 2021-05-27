package homework.lesson4.task3.application;

import homework.lesson4.task3.workers.ServiceDesk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = bufferedReader.readLine();
            if (input.equals("стоп")) break;
            ServiceDesk.createTicket(input);
        }
    }
}
