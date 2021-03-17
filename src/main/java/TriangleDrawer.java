public class TriangleDrawer {
    public String drawTriangle(int side) {
        String triangle = "";
        int i = 0;
        int k = 0;

        while (i < side) {
            int j = k;
            k++;
            while (j < side) {
                triangle = triangle + "*";
                j++;
            }
            triangle = triangle + "\n";
            i++;
        }
        return triangle;
    }

    public static void main(String[] args) {
        TriangleDrawer triangleDrawer = new TriangleDrawer();

        //Should be:
        //***
        //**
        //*
        System.out.println(triangleDrawer.drawTriangle(3));
    }
}
