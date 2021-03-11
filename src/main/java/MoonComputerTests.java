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

    //Test output on Hello Java standard input
    public static void main1(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
        computerTests.testBasicInputOutput();
    }

    //Test output on 24, 4 standard input
    public static void main(String[] args) {
        new MoonComputerTests().testMath();
    }
}
