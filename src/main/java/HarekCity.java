import java.util.*;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[] {};
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        int[] ageArray = {age1, age2, age3, age4};
        return ageArray;
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] namesNew) {
        String firstAndLast = namesNew[0] + " AND " + namesNew[9] + " TOGETHER";
        return firstAndLast;
    }

    public void changeElectResult(String[] results) {
        String buf;
        buf = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = buf;
    }

    public String[] changeElectResultAgain(String[] resultsNew) {
        String[] shortArr = new String[] {resultsNew[2], resultsNew[3], resultsNew[4]};
        return shortArr;
    }

    public char[][] createKeyboard() {
        char[][] keyBoard = new char[][] {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}, {'*', '0', '#'}};
        return keyBoard;
    }

    public void printKeyboard() {
        char[][] newKeyboard = createKeyboard();
        System.out.println(Arrays.toString(newKeyboard[0]) + "\n" + Arrays.toString(newKeyboard[1]) + "\n" + Arrays.toString(newKeyboard[2]) + "\n" + Arrays.toString(newKeyboard[3]));
    }

    public static void main(String[] args) {
        String[] arr = new HarekCity().createEmptyNameArray();
        System.out.println(Arrays.toString(arr));

        int[] ageArray = new HarekCity().createAgeArray(10, 20, 30, 40);
        System.out.println(Arrays.toString(ageArray));

        String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        String[] toReplace = new String[]{"lopr", "boki"};
        new HarekCity().fixNames(names, toReplace);
        System.out.println(Arrays.toString(names));

        String[] namesNew = new String[]{"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
        System.out.println(new HarekCity().firstAndLastTogether(namesNew));

        String[] results = new String[]{"miho", "hut"};
        new HarekCity().changeElectResult(results);
        System.out.println(Arrays.toString(results));

        String[] resultsNew = new String[]{"mix", "max", "pex", "fux", "rox"};
        String[] changedResults = new HarekCity().changeElectResultAgain(resultsNew);
        System.out.println(Arrays.toString(changedResults));

        char[][] keyboard = new HarekCity().createKeyboard();
        for (int i = 0; i < keyboard.length; i++) {
            System.out.println(Arrays.toString(keyboard[i]));
        }

        new HarekCity().printKeyboard();
    }
}
