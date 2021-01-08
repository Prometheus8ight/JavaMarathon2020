package day12.task3;


import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("Butterfly Temple", 1995));
        musicBands.add(new MusicBand("Black Sun Empire", 1999));
        musicBands.add(new MusicBand("Mechanical Poet", 2002));
        musicBands.add(new MusicBand("5’Nizza", 2000));
        musicBands.add(new MusicBand("Born From Pain", 1997));
        musicBands.add(new MusicBand("Plain Jane Automobile", 2001));
        musicBands.add(new MusicBand("Burning Rain", 1998));
        musicBands.add(new MusicBand("La Dispute", 2004));
        musicBands.add(new MusicBand("C-Block", 1996));
        musicBands.add(new MusicBand("CocoRosie", 2003));

        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        System.out.println(groupsAfter2000(musicBands));

    }


    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands) {
        List<MusicBand> musicBands2000 = new ArrayList<>();
        for (MusicBand band : musicBands) {
            if (band.getYear() > 2000)
                musicBands2000.add(band);
        }return musicBands2000;
    }
}



