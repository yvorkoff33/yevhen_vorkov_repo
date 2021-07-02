package RobotsWar;

public class Main {
    public static void main(String[] args) {
        Robot workingRobot;
        CharShot charShot = new CharShot();

        System.out.println("Загрузка игры...");

        PrintTextForRobots.printSetName(1);
        String name = ConsoleScanner.getNameOfRobotsFromConsole();

        PrintTextForRobots.printSetName(2);
        String name2 = ConsoleScanner.getNameOfRobotsFromConsole();

        Robot robot1 = new Robot(name, 20);
        Robot robot2 = new Robot(name2, 20);

        ListOfRobot.addRobot(robot1);
        ListOfRobot.addRobot(robot2);

//        System.out.println(robot1.getDemageKeys());
//        System.out.println(robot2.getDemageKeys());
//        System.out.println("Robot 1= " + robot1.getRobotsHealth());
//        System.out.println("Robot 2= " + robot2.getRobotsHealth());

        String exitChar = "L";
        do {
            for (int i = 0; i < ListOfRobot.getRobotArrayList().size(); i++) {
                workingRobot = ListOfRobot.getRobotArrayList().get(i);
                System.out.println(String.format("Выстрел в робота= %s", workingRobot.getRobotsName()));
                PrintTextForRobots.printRules();
                String setInput = ConsoleScanner.getCharFromConsole();
                exitChar = setInput;
                if (exitChar.equals("L")) {
                    System.out.println("Выход из игры");
                    break;
                } else if (charShot.alphabet.contains(exitChar)) {

                    char[] charInput2 = exitChar.toCharArray();

                    if (workingRobot.getDamageKeys().contains(charInput2[0])) {
                        System.out.println(String.format("Отличный выстрел!!! Бабах -20 балов у робота %s",workingRobot.getRobotsName()));
                        int health = workingRobot.getRobotsHealth();
                        workingRobot.setRobotsHelth(health - 20);
                        workingRobot.removeCharByIndex(charInput2[0]);

                        int healthNew = workingRobot.getRobotsHealth();
                        if (healthNew <= 0) {
                            ListOfRobot.removeRobotFromList(workingRobot);
                            System.out.println("-----");
                            System.out.println(String.format("Выиграл робот %s",ListOfRobot.getRobotArrayList().get(0).getRobotsName()));
                            System.out.println("-----");
                            exitChar = "L";
                            break;
                        }
                    } else {
                        System.out.println("В следующий раз повезет, не расстраивайся!");
                        System.out.println(" ");
                        continue;
                    }
                } else {
                    System.out.println("Ввод не валидный!!!");
                    System.out.println("Ход передается другому роботу");
                    System.out.println(" ");
                    continue;
                }
            }
            System.out.println(String.format("У робота %s осталось %s балов жизни",robot1.getRobotsName(), robot1.getRobotsHealth()));
            System.out.println(String.format("У робота %s осталось %s балов жизни",robot2.getRobotsName(), robot2.getRobotsHealth()));
            System.out.println(" ");
        } while (!exitChar.equals("L"));
    }
}

//        ------- Set count of robots and set names

//        do {
//
//            PrintcountOfRobots.printCount();
//            int setCount = ConsoleScanner.getNumberOfRobotsFromConsole();
//            System.out.println(String.format("Количество роботов в игре= %s", setCount));
//            exitNum = setCount;
//
//            if (setCount == 0) {
//                System.out.println("Ввод не валидный!!!");
//                continue;
//            } else if (setCount >= 2 && setCount <= 5) {
//                for (int i = 0; i < setCount; i++) {
//                    PrintcountOfRobots.printSetName(i + 1);
//                    String name = ConsoleScanner.getNameOfRobotsFromConsole();
//                    int health = 100;
//                    ListOfRobot.addRobot(name, health);
//                    System.out.println(String.format("Имя робота №%s= %s, заряд= %s", i+1, name, health));
//                }
//             //   System.out.println(ListOfRobot.getRobotHashMap());
//                exitNum = 100;
//            } else {
//                System.out.println("Ввод не валидный!!!");
//                continue;
//            }
//        } while (exitNum != 100);

