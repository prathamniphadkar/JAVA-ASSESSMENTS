public class MaxSumPath {
    public static int maxSumPath(int[] X, int[] Y) {
        int sumX = 0;
        int sumY = 0;
        int maxSum = 0;
        int i = 0;
        int j = 0;

        while (i < X.length && j < Y.length) {
            if (X[i] < Y[j]) {
                sumX += X[i];
                i++;
            } else if (Y[j] < X[i]) {
                sumY += Y[j];
                j++;
            } else {
                maxSum += Math.max(sumX, sumY) + X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }

        while (i < X.length) {
            sumX += X[i];
            i++;
        }

        while (j < Y.length) {
            sumY += Y[j];
            j++;
        }

        maxSum += Math.max(sumX, sumY);

        return maxSum;
    }

    public static void main(String[] args) {
        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};
        System.out.println("The maximum sum path is: " + maxSumPath(X, Y));
    }
}
