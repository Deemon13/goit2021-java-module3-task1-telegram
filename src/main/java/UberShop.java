import java.util.*;

public class UberShop {
    public void printPrices(float[] prices1) {
        for(int i = 0; i <= prices1.length - 1; i++) {
            System.out.println(prices1[i] + " jup.");
        }
    }

    public void multiplyPrices(float[] prices2) {
        for (int i = 0; i <= prices2.length - 1; i++) {
            if (prices2[i] < 1000) {
                prices2[i] = prices2[i] * 2f;
            } else {
                prices2[i] = prices2[i] * 1.5f;
            }
        }
    }

    public int[] findMinMaxPrices(int[] prices) {

        if (prices.length == 0) {
            return new int[0];
        }

        int maxEl = prices[0];
        int minEl = prices[0];

        for (int i = 0; i <= prices.length-1; i++) {
            if (prices[i] > maxEl) {
                maxEl = prices[i];
            }

            if (prices[i] < minEl) {
                minEl = prices[i];
            }
        }

         if (maxEl == minEl) {
            return new int[] {maxEl};
        } else {
            return new int[] {minEl, maxEl};
        }
    }


    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
        float[] prices1 = new float[] {100f, 23.5f, 400f};
        shop.printPrices(prices1);

        //Should be [200, 2250]
        float[] prices2 = new float[] {100f, 1500f};
        shop.multiplyPrices(prices2);
        System.out.println(Arrays.toString(prices2));

        //Should be [50, 1500]
        int[] prices = new int[] {100, 1500, 300, 50};
        int[] minMax = shop.findMinMaxPrices(prices);
        System.out.println(Arrays.toString(minMax));
        //Should be [3, 1550]
        int[] pricesTwo = new int[] {10, 50, 3, 1550};
        int[] minMaxTwo = shop.findMinMaxPrices(pricesTwo);
        System.out.println(Arrays.toString(minMaxTwo));
        //Should be []
        int[] pricesThree = new int[] {};
        int[] minMaxThree = shop.findMinMaxPrices(pricesThree);
        System.out.println(Arrays.toString(minMaxThree));
        //Should be [50]
        int[] pricesFour = new int[] {50, 50};
        int[] minMaxFour = shop.findMinMaxPrices(pricesFour);
        System.out.println(Arrays.toString(minMaxFour));
    }

}
