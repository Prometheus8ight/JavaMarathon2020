package day12.task4;

import java.util.*;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;


    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String toString() {
        return "Группа: " + name + ". Год основания группы " + year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand x, MusicBand y){
    for(String member : x.getMembers())
        y.getMembers().add(member);
    x.getMembers().clear();
    }

    public void printMembers(){
        System.out.println(this.members);
    }
}
