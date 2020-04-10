import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER. The function accepts
     * 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {

        int leftSum = 0;
        int rightSum = 0;
        int leftIndex = 0;
        int rightIndex = arr.size() - 1;

        while (leftIndex < arr.size()) {
            leftSum += arr.get(leftIndex).get(leftIndex);
            System.out.println(leftSum);
            rightSum += arr.get(leftIndex).get(rightIndex);
            System.out.println(rightSum);
            leftIndex++;
            rightIndex--;
        }

        return Math.abs(leftSum - rightSum);

    }
}
