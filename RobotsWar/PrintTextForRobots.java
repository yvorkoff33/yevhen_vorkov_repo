package RobotsWar;


public class PrintTextForRobots extends ConsoleScanner {

    public static void printSetName(int i) {
        System.out.println("Введите имя для робота " + i);
    }

    public static void printRules() {
        System.out.println("Для выстрела введите: 'Q,W,E,A,S,D,Z,X,C'");
        System.out.println("Для выхода нажмите 'L'");
    }

}

