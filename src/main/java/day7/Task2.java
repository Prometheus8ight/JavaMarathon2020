package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        Player player1 = new Player(random.nextInt(100));
        Player player2 = new Player(random.nextInt(100));
        Player player3 = new Player(random.nextInt(100));

        Player player4 = new Player(random.nextInt(100));
        Player player5 = new Player(random.nextInt(100));
        Player player6 = new Player(random.nextInt(100));


        for (int i = 0; i < 100; i++)
            player3.run();

        System.out.println(player3.getStamina());
        Player.info();
    }
}