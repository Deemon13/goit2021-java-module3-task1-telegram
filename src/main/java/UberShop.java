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

    public int[] leavePrice9(int[] prices) {

        int j = 0;
        int k = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] % 10 != 9) {
                j++;
            }
        }

        int[] newPrices = new int[prices.length - j];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] % 10 == 9) {
                newPrices[k] = prices[i];
                k++;
            }
        }
        return newPrices;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        String[] mergedStocks = Arrays.copyOf(showcaseStocks, showcaseStocks.length + warehouseStocks.length);
        int j = showcaseStocks.length; //2

        for (int i = 0; i < warehouseStocks.length; i++) {
            mergedStocks[j] = warehouseStocks[i];
            j++;
        }
        return mergedStocks;
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
        shop.printPrices(new float[] {100f, 23.5f, 400f});

        //Should be [200, 2250] - Проверить!
        float[] pricesArr = new float[] {100f, 1500f};
        shop.multiplyPrices(pricesArr);
        System.out.println(Arrays.toString(pricesArr));

        //Should be [50, 1500]
        System.out.println(Arrays.toString(shop.findMinMaxPrices(new int[] {100, 1500, 300, 50})));
        //Should be [3, 1550]
        System.out.println(Arrays.toString(shop.findMinMaxPrices(new int[] {10, 50, 3, 1550})));
        //Should be []
        System.out.println(Arrays.toString(shop.findMinMaxPrices(new int[] {})));
        //Should be [50]
        System.out.println(Arrays.toString(shop.findMinMaxPrices(new int[] {50, 50})));

        System.out.println(shop.getMinPriceCount(new int[] {100, 1500, 300, 50, 10, 10, 70})); //Should be 2
        System.out.println(shop.getMinPriceCount(new int[] {})); //Should be 0
        System.out.println(shop.getMinPriceCount(new int[] {5, 5, 5})); //Should be 3
        System.out.println(shop.getMinPriceCount(new int[] {5, 10, 15, 3, 5})); //Should be 1

        //Should be [150, 200]
        System.out.println(Arrays.toString(shop.removePrice(new int[]{150, 100, 200}, 100)));
        //Should be []
        System.out.println(Arrays.toString(shop.removePrice(new int[]{100, 100, 100}, 100)));

        //Should be [399, 1599, 399]
        System.out.println(Arrays.toString(shop.leavePrice9(new int[] {399, 1599, 399, 50, 10, 10, 70})));
        //Should be [99, 49]
        System.out.println(Arrays.toString(shop.leavePrice9(new int[] {1, 99, 5, 49})));
        //Should be []
        System.out.println(Arrays.toString(shop.leavePrice9(new int[] {})));

        //Final result should be ["gun", "firebow", "firegun"]
        String[] showcaseStocks = new String[] {"gun", "firebow"};
        String[] warehouseStocks = new String[] {"firegun"};
        System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));
    }
}
