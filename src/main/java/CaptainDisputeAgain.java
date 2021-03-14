public class CaptainDisputeAgain {

    public int findMin(int[] triple) {
        int firstEl = triple[0];
        int secondEl = triple[1];
        int thirdEl = triple[2];

        return firstEl < secondEl && firstEl < thirdEl ? firstEl : secondEl < firstEl && secondEl < firstEl ? secondEl : thirdEl;
    }


    public static void main(String[] args) {
        CaptainDisputeAgain captainDisputeAgain = new CaptainDisputeAgain();

        //Should be even
        System.out.println(captainDisputeAgain.findMin(new int[] {1, 10, 3}));

        //Should be odd
        System.out.println(captainDisputeAgain.findMin(new int[] {50, 4, 100}));
    }
}
