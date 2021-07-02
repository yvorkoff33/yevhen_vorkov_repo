package RobotsWar;

import java.util.ArrayList;
import java.util.Random;

public class CharShot {
    String alphabet = "QWEASDZXC";
    private ArrayList<Character> shotChar = new ArrayList<>();

    public ArrayList<Character> getShotChar() {
        return shotChar;
    }

    char getRandomKey() {
        int randIdx = new Random().nextInt(alphabet.length());
        char randChar = alphabet.charAt(randIdx);
        alphabet = alphabet.replace(String.valueOf(randChar), "");
        return randChar;
    }

    public void setRandomChar() {
        for (int i = 0; i < 5; i++) {
            char ran = getRandomKey();
            shotChar.add(ran);
        }
    }

}
