/**
 * Created by Björn on 2016-11-24.
 */

public class Main {
    public static void main(String[] args) throws InterruptedException{
        while (true) {
            StartMenu startMenu = new StartMenu();
            startMenu.setVisible(true);

            while (startMenu.active){
                Thread.sleep(10);
            }

            if (startMenu.getAction() == "start_game"){
                System.out.println("START GAME");
                Game g = new Game();
                g.start();
            }
            else if (startMenu.getAction() == "highscores"){
                System.out.println("SHOW HIGHSCORE");
            }
            else if (startMenu.getAction() == "exit_game"){
                System.exit(0);
            }


            while (true){
                Thread.sleep(100);
            }
        }
    }
}
