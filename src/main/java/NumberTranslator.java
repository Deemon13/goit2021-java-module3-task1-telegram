public class NumberTranslator {

    public int translate(String romanNumber) {}

    public static void main(String[] args) {
        NumberTranslator numberTranslator = new NumberTranslator();

        //Should be 1
        System.out.println(numberTranslator.translate("I");
        //Should be 11
        System.out.println(numberTranslator.translate("  X  I");
        //Should be 9
        System.out.println(numberTranslator.translate("iX  ");
        //Should be -1
        System.out.println(numberTranslator.translate("XX");
    }
}
