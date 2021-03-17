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

    public String drawLine(int length) {
        String line = "";
        int i = 0;
        while (i < length) {
            if (i % 2 == 0) {
                line = line + "*";
            } else {
                line = line + "#";
            }
            i++;
        }
        return line;
    }

    public String drawPattern(char[] pattern, int repeatCount) {
        String resultString = "";
        int i = 0;
        int patternLength = pattern.length;

            while (patternLength > 0) {
                resultString += pattern[i];
                patternLength--;
                i++;
            }

        return  resultString.repeat(repeatCount);
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

        //Should be:
        //*#*#*
        System.out.println(helper.drawLine(5));

        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }
}
