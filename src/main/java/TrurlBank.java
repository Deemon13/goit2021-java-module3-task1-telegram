public class TrurlBank {
    public int sumQuads(int n) {
        int i = 1;
        int sumOfQuads = 0;
        while (i <= n) {
            sumOfQuads = sumOfQuads + i*i;
            i++;
        }
        return sumOfQuads;
    }

    public int countSumOfDigits(int number) {
        int countSum = 0;
        String numb = String.valueOf(number);
        int i = 0;

        while (i < numb.length()){
            countSum += Integer.parseInt(String.valueOf(numb.charAt(i)));
            i++;
        }
        return countSum;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 = 1*1 + 2*2 + 3*3
        System.out.println(bank.sumQuads(3));
        //Should be 1 = 1*1
        System.out.println(bank.sumQuads(1));

        //Should be 16 = 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
        //Should be 18 = 9 + 9
        System.out.println(bank.countSumOfDigits(99));
        //Should be 3 = 1 + 1 + 1
        System.out.println(bank.countSumOfDigits(111));
    }
}
