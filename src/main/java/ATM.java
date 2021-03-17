public class ATM {
    public int countBanknotes(int sum) {
        int bank = sum;
        int count = 0;
        int i = 0;
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        while ( i < banknotes.length) {
            if (bank / banknotes[i] != 0) {
                count = count + bank / banknotes[i];
                bank = bank % banknotes[i];
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        ATM count = new ATM();

        //Should be 1
        System.out.println(count.countBanknotes(500));
        //Should be 6 = 500 + 50 + 20 + 5 + 2 + 1
        System.out.println(count.countBanknotes(578));
    }
}
