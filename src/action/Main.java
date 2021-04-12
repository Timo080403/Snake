package action;

import Gui.Screen;
import Gui.gui;
import clock.GameClock;
import game.Difficulties;
import game.Direction;
import game.Snake;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static clock.GameClock.startScreenSnake;

public class Main {
    public static boolean running = false ;
    public static Screen screen = Screen.Start;
    public static GameClock gameClock;
    public static Difficulties difficulties = Difficulties.EASY;

    public static void main(String[] args) throws IOException {
        gui g= new gui();
        gameClock = new GameClock();
        gameClock.setName("Gameclock");
        gameClock.start();
        g.create();
        startScreenSnake();

        File file = new File("src/game/Highscore.txt");
        if(file.exists()){
            Scanner scanner = new Scanner(file);
            if(scanner.hasNextInt()){
                System.out.println("hallo");
                Snake.highscore = scanner.nextInt();
            }
            scanner.close();
        }
    }

    //Getter und Setter
    public static Screen getScreen() {
        return screen;
    }

    public static void setScreen(Screen screen) {
        Main.screen = screen;
    }

    public static boolean isRunning() {
        return running;
    }

    public static void setRunning(boolean running) {
        Main.running = running;
    }

    public static Difficulties getDifficulties() {
        return difficulties;
    }

    public static void setDifficulties(Difficulties difficulties) {
        Main.difficulties = difficulties;
    }


}
