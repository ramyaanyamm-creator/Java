import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String op = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();

            BitSet a = (x == 1) ? b1 : b2;
            BitSet b = (y == 1) ? b1 : b2;

            switch (op) {
                case "AND":
                    a.and(b);
                    break;
                case "OR":
                    a.or(b);
                    break;
                case "XOR":
                    a.xor(b);
                    break;
                case "FLIP":
                    a.flip(y);
                    break;
                case "SET":
                    a.set(y);
                    break;
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}