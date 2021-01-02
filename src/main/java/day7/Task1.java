package day7;

public class Task1 {
    public static void main(String[] args) {
    Airplane boeing = new Airplane("Boeing", 2010, 1200, 3000,0);
    Airplane airbus = new Airplane("Airbus", 2008, 1000, 3200,100);
    boeing.info();
    Airplane.compareAirplanes(boeing,airbus);
    }
}