package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int playersCount;

    public Player(int stamina) {
        this.stamina = stamina;

        if (playersCount < 6)
            playersCount++;
    }

    public void run() {
        if (stamina == 0)
            return;

        stamina--;

        if (stamina == 0)
            playersCount--;

    }

    public int getStamina() {
        return stamina;
    }

    public static int getPlayersCount() {
        return playersCount;
    }

    public static void info() {
        if (playersCount < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - playersCount) + " свободных мест.");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}




