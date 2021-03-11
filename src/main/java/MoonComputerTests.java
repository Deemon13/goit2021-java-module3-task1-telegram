import java.util.*;

public class MoonComputerTests {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String helloJava = scanner.nextLine();
        System.out.println(helloJava);
        scanner.close();
    }

    //Test output on Hello Java standard input
    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
        computerTests.testBasicInputOutput();
    }
}
