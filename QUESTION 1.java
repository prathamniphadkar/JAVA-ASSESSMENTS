import java.util.*;

public class MergeSorted {
    // Driver code
    public static void main(String[] args) {
        int X[] = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int n1 = X.length;

        int Y[] = {1, 8, 9, 10, 15};
        int n2 = Y.length;

        // Remove zeroes from X
        int[] newX = removeZeros(X);

        int arr3[] = new int[n1 + n2];
        mergeArrays(newX, Y, newX.length, n2, arr3);

        // Remove zeroes from the merged array
        int[] result = removeZeros(arr3);

        System.out.println("Array after merging");
        for (int num : result)
            System.out.print(num + " ");
    }

    public static void mergeArrays(int[] X, int[] Y, int n1, int n2, int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;

        // Merge X and Y
        while (i < n1 && j < n2) {
            if (X[i] < Y[j]) {
                arr3[k++] = X[i++];
            } else {
                arr3[k++] = Y[j++];
            }
        }

        // If there are remaining elements in X
        while (i < n1) {
            arr3[k++] = X[i++];
        }

        // If there are remaining elements in Y
        while (j < n2) {
            arr3[k++] = Y[j++];
        }
    }

    // Function to remove zeroes from an array
    public static int[] removeZeros(int[] arr) {
        int count = 0; // Count of non-zero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }

        int[] newArr = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[index++] = arr[i];
            }
        }
        return newArr;
    }
}