package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Myke Shinoda");
        members1.add("Chester Bennigton");
        members1.add("Brad Delson");
        members1.add("Dave Farrell");
        members1.add("Joe Hahn");
        members1.add("Rob Bourdon");
        MusicBand band1 = new MusicBand("Linkin Park", 1996, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Sonny Sandoval");
        members2.add("Wuv Bernardo");
        members2.add("Traa Daniels");
        members2.add("Marcos Curiel");
        MusicBand band2 = new MusicBand("P.O.D.", 1997, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);

        band1.printMembers();
        band2.printMembers();
    }
}
