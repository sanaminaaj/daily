// Java Program to print pattern
// Number-increasing reverse pyramid
import java.util.*;

public class ReversePyramid {
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;
        // outer loop to handle number of rows
        for (i = n; i >= 1; i--) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // printing column values upto the row
                // value.
                System.out.print(j + " ");
            }

            // print new line for each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
