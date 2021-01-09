package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Привет! Как дела?");
        user1.sendMessage(user2, "Чем занимаешься?");

        user2.sendMessage(user1, "Привет!");
        user2.sendMessage(user1, "Чё как?");

        MessageDatabase.shodDialog(user1, user2);

    }
}
