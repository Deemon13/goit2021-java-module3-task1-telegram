import java.util.*;

public class UberShop {
    public void printPrices(float[] prices1) {
        for(int i = 0; i <= prices1.length - 1; i++) {
            System.out.println(prices1[i] + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i <= prices.length - 1; i++) {
            if (prices[i] < 1000) {
                prices[i] = prices[i] * 2f;
            } else {
                prices[i] = prices[i] * 1.5f;
            }
        }
    }


    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
        float[] prices1 = new float[] {100f, 23.5f, 400f};
        shop.printPrices(prices1);

        //Should be [200, 2250]
        float[] prices = new float[] {100f, 1500f};
        shop.multiplyPrices(prices);
        System.out.println(Arrays.toString(prices));
    }

}
