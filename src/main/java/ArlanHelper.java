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

    public String drawRect(int width, int height, char c) {
        String rect = "";
        int i = 0;
        while (i < height) {
            int j = 0;
            while (j < width) {
                rect = rect + c;
                j++;
            }
            rect = rect + "\n";
            i++;
        }
        return rect;
    }

    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));

        //Should be:
        //XX
        //XX
        //XX
        System.out.println(helper.drawRect(2, 3, 'X'));
    }
}
