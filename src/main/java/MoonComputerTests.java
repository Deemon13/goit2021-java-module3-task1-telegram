import java.util.*;

public class MoonComputerTests {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String helloJava = scanner.nextLine();
        System.out.println(helloJava);
        scanner.close();
    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mult = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;
        System.out.println(sum + " " + sub + " " + mult + " " + div);
        scanner.close();
    }

    public void testLogicalOperators() {
        Scanner scanner = new Scanner(System.in);
        boolean firstBool = scanner.nextBoolean();
        boolean secondBool = scanner.nextBoolean();
        boolean thirdBool = scanner.nextBoolean();

        boolean andBool = firstBool && secondBool && thirdBool;
        boolean orBool = firstBool || secondBool || thirdBool;

        System.out.println(andBool + " " + orBool);

        scanner.close();
    }

    /*
    //Test output on Hello Java standard input
    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
        computerTests.testBasicInputOutput();
    }
     */

    /*
    //Test output on 24, 4 standard input
    public static void main(String[] args) {
        new MoonComputerTests().testMath();
    }
     */

    //Test output on true, true, false standard input
    public static void main(String[] args) {
        new MoonComputerTests().testLogicalOperators();
    }
}
