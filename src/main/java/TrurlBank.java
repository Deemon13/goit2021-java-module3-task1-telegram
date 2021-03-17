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

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 = 1*1 + 2*2 + 3*3
        System.out.println(bank.sumQuads(3));
        //Should be 1 = 1*1
        System.out.println(bank.sumQuads(1));
    }
}
