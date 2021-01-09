package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<User> subscription;

    public User(String name) {
        this.name = name;
        this.subscription = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<User> getSubscription() {
        return subscription;
    }

    public void subscribe(User user){
        this.subscription.add(user);
    }

    public boolean isSubscribed(User user){
        for(User xUser : subscription){
            xUser.getName().equals(user.getName());
            return true;
        }return false;
        }

    public boolean isFriend(User user){
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String toString(){
        return name;
    }
}
