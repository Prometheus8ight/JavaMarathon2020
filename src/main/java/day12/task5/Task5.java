package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Myke Shinoda", 38));
        members1.add(new MusicArtist("Chester Bennigton", 40));
        members1.add(new MusicArtist("Brad Delson", 39));
        members1.add(new MusicArtist("Dave Farrell", 37));
        members1.add(new MusicArtist("Joe Hahn", 38));
        members1.add(new MusicArtist("Rob Bourdon", 36));

        MusicBand band1 = new MusicBand("Linkin Park", 1996, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Sonny Sandoval", 36));
        members2.add(new MusicArtist("Wuv Bernardo", 39));
        members2.add(new MusicArtist("Traa Daniels", 40));
        members2.add(new MusicArtist("Marcos Curiel", 38));


        MusicBand band2 = new MusicBand("P.O.D.", 1997, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();


    }
}
