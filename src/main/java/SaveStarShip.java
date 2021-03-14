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
        int price = 50;

        if (fuel.equals("STAR100")) {
            price = 70;
        } else if (fuel.equals("STAR500")) {
            price = 120;
        } else if (fuel.equals("STAR1000")) {
            price = 200;
        }

        return count * price;
    }

    public int roundSpeed(int speed) {
        int firstSign = speed / 10;
        int secondSign = speed % 10;

        if (secondSign >= 5) {
            firstSign++;
        }

        return firstSign * 10;
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
            return 1000;
        } else {
            return ((distance - 20) * 5) + 1000;
        }
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

        //Should be 60
        System.out.println(ship.roundSpeed(55));
        //Should be 10
        System.out.println(ship.roundSpeed(10));
        //Should be 50
        System.out.println(ship.roundSpeed(15));
        //Should be 90
        System.out.println(ship.roundSpeed(89));

        //Should be 1005
        System.out.println(ship.calculateNeededFuel(21));
        //Should be 1000
        System.out.println(ship.calculateNeededFuel(1));
        //Should be 1000
        System.out.println(ship.calculateNeededFuel(20));
        //Should be 1025
        System.out.println(ship.calculateNeededFuel(25));
    }
}
