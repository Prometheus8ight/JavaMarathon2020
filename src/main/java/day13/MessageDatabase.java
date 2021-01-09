package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User sender, User receiver, String text) {
        messages.add(new Message(sender, receiver, text));
    }

    public static void shodDialog(User x, User y){
        for(Message message: messages){
            if(message.getSender() == x && message.getReceiver() == y ||
                    message.getSender() == y && message.getReceiver() == x);{
                System.out.println(message.getSender() + ": " + message.getText());
            }

        }
    }


}
