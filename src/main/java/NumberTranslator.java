public class NumberTranslator {

    public int translate(String romanNumber) {
        String normalizeRomanNumber = romanNumber.toUpperCase().replace(" ", "");
        int digit;

        switch(normalizeRomanNumber) {
            case "I":
                digit = 1;
                break;
            case "II":
                digit = 2;
                break;
            case "III":
                digit = 3;
                break;
            case "IV":
                digit = 4;
                break;
            case "V":
                digit = 5;
                break;
            case "VI":
                digit = 6;
                break;
            case "VII":
                digit = 7;
                break;
            case "VIII":
                digit = 8;
                break;
            case "IX":
                digit = 9;
                break;
            case "X":
                digit = 10;
                break;
            case "XI":
                digit = 11;
                break;
            case "XII":
                digit = 12;
                break;
            default:
                digit = -1;
        }
        return digit;
    }

    public static void main(String[] args) {
        NumberTranslator numberTranslator = new NumberTranslator();

        //Should be 1
        System.out.println(numberTranslator.translate("I"));
        //Should be 11
        System.out.println(numberTranslator.translate("  X  I"));
        //Should be 9
        System.out.println(numberTranslator.translate("iX  "));
        //Should be -1
        System.out.println(numberTranslator.translate("XX"));
    }
}
