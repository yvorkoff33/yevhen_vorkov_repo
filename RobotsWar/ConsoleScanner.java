package RobotsWar;

import java.util.Scanner;

public class ConsoleScanner {

    public static String getNameOfRobotsFromConsole() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.next();
        } catch (Exception e) {
            return "";
        }
    }

    public static String getCharFromConsole() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.next();
        } catch (Exception e) {
            return "";
        }
    }

}
