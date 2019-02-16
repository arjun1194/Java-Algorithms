import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
                        23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40
                };
        int[][] outputArray = pairSumEqual(array);
        int size = outputArray.length;
        
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (outputArray[i][0] == outputArray[j][0])
                    System.out.println("Value is:" + outputArray[i][0] + " " + "Pairs are: " +
                            " (" + outputArray[i][1] + "," + outputArray[i][2] + ")" + " and " +
                            " (" + outputArray[j][1] + "," + outputArray[j][2] + ")");
            }
        }

    }

    public static int[][] pairSumEqual(int[] inputArray) {
        int n = inputArray.length;

        int al = n * (n - 1) / 2;
        int position = 0;
        int[][] outputArray = new int[al][3];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (position < al) {
                    outputArray[position][0] = inputArray[i] + inputArray[j];
                    outputArray[position][1] = inputArray[i];
                    outputArray[position][2] = inputArray[j];
                    position++;
                }

            }

        }
        return outputArray;
    }
}
