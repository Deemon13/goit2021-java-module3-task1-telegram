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

    public static void main(String[] args) {
        String[] arr = new HarekCity().createEmptyNameArray();
        System.out.println(Arrays.toString(arr));

        int[] ageArray = new HarekCity().createAgeArray(10, 20, 30, 40);
        System.out.println(Arrays.toString(ageArray));

        String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        String[] toReplace = new String[]{"lopr", "boki"};
        new HarekCity().fixNames(names, toReplace);
        System.out.println(Arrays.toString(names));
    }
}
