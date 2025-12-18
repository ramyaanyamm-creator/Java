import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            BigInteger n = sc.nextBigInteger();
            boolean canFit = false;

            StringBuilder result = new StringBuilder();

            if (n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                result.append("* byte\n");
                canFit = true;
            }

            if (n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                result.append("* short\n");
                canFit = true;
            }

            if (n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                result.append("* int\n");
                canFit = true;
            }

            if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                result.append("* long\n");
                canFit = true;
            }

            if (canFit) {
                System.out.println(n + " can be fitted in:");
                System.out.print(result);
            } else {
                System.out.println(n + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
