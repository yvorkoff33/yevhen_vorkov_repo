package RobotsWar;

import java.util.ArrayList;

public class ListOfRobot {

    static ArrayList<Robot> robotArrayList = new ArrayList<>();

    public static void addRobot(Robot robot) {
        robotArrayList.add(robot);
    }

    public static ArrayList<Robot> getRobotArrayList() {
        return robotArrayList;
    }

    public static void removeRobotFromList(Robot robot){
        robotArrayList.remove(robot);
    }

}
