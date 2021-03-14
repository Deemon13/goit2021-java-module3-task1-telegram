import java.util.*;

public class SaveStarShip {

    public int calculateDistance(int distance) {
        if (distance < 0) {
            return distance * -1;
        }
        return distance;
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[] {"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[] {"Earth", "Mars", "Jupiter"};
        } else if (galaxy.equals("DangerBanger")) {
            return new String[] {"Fobius", "Demius"};
        } else {
            return new String[] {};
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) {
            return "Earth";
        }
        return "Pern";
    }

    public int calculateFuelPrice(String fuel, int count) {
        if (fuel == "STAR100") {
            return count * 70;
        } else if (fuel == "STAR500") {
            return count * 120;
        } else if (fuel == "STAR1000") {
            return count * 200;
        }
        return count * 50;
    }

    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));
        //Should be 15
        System.out.println(ship.calculateDistance(15));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));
        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("Unknown")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));
        //Should be Pern
        System.out.println(ship.choosePlanet(100000));

        //Should be 700
        System.out.println(ship.calculateFuelPrice("STAR100", 10));
        //Should be 250
        System.out.println(ship.calculateFuelPrice("STAR7", 5));
    }
}
