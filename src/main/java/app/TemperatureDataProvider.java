package app;

import java.util.Scanner;

public class TemperatureDataProvider {

    public int getTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current temperature: ");
        return scanner.nextInt();
    }
}
