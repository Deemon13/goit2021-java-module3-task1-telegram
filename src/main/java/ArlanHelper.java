public class ArlanHelper {

    public String drawQuad(int n) {
        String quad = "";
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                quad = quad + "*";
                j++;
            }
            quad = quad + "\n";
            i++;
        }
        return quad;
    }

    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));
    }
}
