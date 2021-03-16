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

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        int count = 0;

        for(int price: prices) {
            if (price < min) {
                min = price;
            }
        }

        for(int price: prices) {
            if (price == min) {
                count++;
            }
        }

        return count;
    }

    public int[] removePrice(int[] prices, int toRemove) {

        int j = 0;
        int k = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == toRemove) {
                j++;
            }
        }

        int[] newPrices = new int[prices.length - j];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                newPrices[k] = prices[i];
                k++;
            }
        }
        return newPrices;
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

        int[] pricesForMinOne = new int[] {100, 1500, 300, 50, 10, 10, 70};
        System.out.println(shop.getMinPriceCount(pricesForMinOne)); //Should be 2
        int[] pricesForMinTwo = new int[] {};
        System.out.println(shop.getMinPriceCount(pricesForMinTwo)); //Should be 0
        int[] pricesForMinThree = new int[] {5, 5, 5};
        System.out.println(shop.getMinPriceCount(pricesForMinThree)); //Should be 3
        int[] pricesForMinFour = new int[] {5, 10, 15, 3, 5};
        System.out.println(shop.getMinPriceCount(pricesForMinFour)); //Should be 1

        //Should be [150, 200]
        int[] pricesFive = new int[]{150, 100, 200};
        int toRemove = 100;
        System.out.println(Arrays.toString(shop.removePrice(pricesFive, toRemove)));
        //Should be []
        int[] pricesSix = new int[]{100, 100, 100};
        System.out.println(Arrays.toString(shop.removePrice(pricesSix, toRemove)));
    }

}
