class Solution {
    int missingNum(int[] arr) {
        long n = arr.length + 1;      // use long
        long sum = n * (n + 1) / 2;   // safe calculation
        long arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        return (int)(sum - arrSum);   // convert back to int
    }
}
