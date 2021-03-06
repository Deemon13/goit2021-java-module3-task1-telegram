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

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int firstEngine = scanner.nextInt();
        int secondEngine = scanner.nextInt();
        int thirdEngine = scanner.nextInt();

        int maxPowerEngine = Math.max(Math.max(firstEngine, secondEngine), thirdEngine);

        if (maxPowerEngine < 10) {
            float maxPower = maxPowerEngine * 0.7f;
            System.out.println(maxPower);
        } else if (maxPowerEngine >= 10 && maxPowerEngine <= 100) {
            float maxPower = maxPowerEngine * 1.2f;
            System.out.println(maxPower);
        } else {
            float maxPower = maxPowerEngine * 2.1f;
            System.out.println(maxPower);
        }
        scanner.close();
    }

    /* AUTOCHECK DECISION
    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int speed1 = scanner.nextInt();
        int speed2 = scanner.nextInt();
        int speed3 = scanner.nextInt();

        int max = speed1;
        if (speed2 > max) {
            max = speed2;
        }
        if (speed3 > max) {
            max = speed3;
        }

        float coeff = 0.7f;
        if (max < 10) {
            coeff = 0.7f;
        } else if (max > 10 && max < 100) {
            coeff = 1.2f;
        } else {
            coeff = 2.1f;
        }

        float maxPower = (float) max * coeff;
        System.out.println(maxPower);
        scanner.close();
    }
    */

    public String getMyPrizes(int ticket) {
        String myPrize = "";
        if (ticket % 10 == 0) {
            myPrize = "crystall";
        }
        if (ticket % 10 == 7) {
            myPrize = myPrize + " chip";
        }
        if (ticket > 200) {
            myPrize = myPrize + " coin";
        }
        return myPrize.trim();
    }


    public boolean isHangarOk(int side1, int side2, int price) {
        int square = side1 * side2;
        int longSide = Math.max(side1, side2);
        int shortSide = Math.min(side1, side2);
        int pricePerMetr = price / square;

        if (square < 1500) return false;
        if (longSide > shortSide * 2) return false;
        if (pricePerMetr > 1000) return false;

        return true;
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

        //Test stdin data - 1 3 5.
        //Console ouput should be 3.5
        //ship.calculateMaxPower();
        //Test stdin data - 5 10 8.
        //Console ouput should be 12
        //ship.calculateMaxPower();

        //Should be "crystall coin"
        System.out.println(ship.getMyPrizes(250));
        //Should be "crystall"
        System.out.println(ship.getMyPrizes(10));
        //Should be "chip"
        System.out.println(ship.getMyPrizes(77));
        //Should be "chip coin"
        System.out.println(ship.getMyPrizes(777));
        //Should be ""
        System.out.println(ship.getMyPrizes(54));

        //Should be true
        System.out.println(ship.isHangarOk(100, 75, 1000000));
        //Should be false
        System.out.println(ship.isHangarOk(100, 20, 1000000));
    }
}
