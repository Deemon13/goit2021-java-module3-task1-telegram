public class CheapStocks {

    public String getCheapStocks(String[] stocks) {
        String cheapGoods = "";
        for (int i = 0; i < stocks.length; i++) {
            String[] parts = stocks[i].split(" ");
            int price = Integer.parseInt(parts[1]);
            if (price < 200) {
                cheapGoods = cheapGoods + " " + parts[0];
            }
        }
        return cheapGoods;
    }

    public static void main(String[] args) {
        CheapStocks cheapStock = new CheapStocks();

        System.out.println(cheapStock.getCheapStocks(new String[] {"gun 500", "firebow 70", "pixboom 200"})); //Should be "firebow"
        System.out.println(cheapStock.getCheapStocks(new String[] {"hy 109", "Sul 197", "Syke 85", "Cefo 605", "riz 75", "Vydeb 933", "Ox 70", "Eh 13", "ku 111", "Jub 218", "tud 422", "pilas 719", "Jezyx 50", "Oqqy 190"})); //Should be "hy" "Sul" "Syke" "riz" "Ox" "Eh" "ku" "Jezyx" "Oqqy"
    }
}
