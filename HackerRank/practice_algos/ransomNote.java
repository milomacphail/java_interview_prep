import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magHM = new HashMap();
        Map<String, Integer> noteHM = new HashMap();

        boolean possible = true;

        for (String m : magazine) {
            if (!magHM.containsKey(m)) {
                magHM.put(m, 1);
            } else {
                magHM.put(m, magHM.get(m) + 1);
            }
        }

        for (String n : note) {
            if (!noteHM.containsKey(n)) {
                noteHM.put(n, 1);
            } else {
                noteHM.put(n, noteHM.get(n) + 1);
            }
        }

        for (String wordNeeded : noteHM.keySet()) {
            if (!magHM.containsKey(wordNeeded)) {
                possible = false;
            } else if (noteHM.get(wordNeeded) > magHM.get(wordNeeded)) {
                possible = false;
            }
        }
        System.out.println(possible ? "Yes" : "No");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}