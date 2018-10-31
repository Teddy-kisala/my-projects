
public class TVshows {

    public static void main(String[] args) {
        int[][] tvRatings = {
            {9, 8, 5},
            {7, 5, 5},
            {8, 8, 8},
            {10, 7, 8},
            {3, 1, 5}};
        int[] average = averageoftable(tvRatings);

        String[] seriesNames = {
            "Big Bang Theory", "Scandal ",
            "Modern Family ", "Dexter    ", "Grand Designs ",};

        System.out.println("TV SHOW " + "\t " + "RATING " + "\t " + "SERIES CONTINUATION");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < tvRatings.length; i++) {
            System.out.print(seriesNames[i] + "\t  ");
            System.out.print(average[i] + "\t  ");
            
            if (average[i] >= 7) {
                    System.out.println("\t     "+"yes");
                } else {
                    System.out.println("\t     "+"no");
                }

        }

    }

    public static int[] averageoftable(int[][] tvRatings) {
        int i = tvRatings.length;
        int j = tvRatings[0].length;
        int[] sum = new int[i];
        int[] Average = new int[i];
        int count = 0;
        for (int rows = 0; rows < i; rows++) {
            for (int col = 0; col < j; col++) {
                sum[rows] += (tvRatings[rows][col]);
                Average[rows] = sum[rows] / 3;
                

            }

        }
        return Average;

    }

}
