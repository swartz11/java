package BitOperation;

public class MinXFinder {
    public static int findMinX(int a, int b, int c) {
        int x = 0;

        // Loop through each bit position (0 to 31 for int)
        for (int bit = 0; bit < 32; bit++) {
            int A = (a >> bit) & 1; // Extract bit from a
            int B = (b >> bit) & 1; // Extract bit from b
            int C = (c >> bit) & 1; // Extract bit from c

            if (C == 1) {
                if (!(A == 1 && B == 1)) {
                    // Need to set this bit in x
                    x |= (1 << bit);
                }
            } else { // C == 0
                if (A == 1 && B == 1) {
                    return -1; // Impossible case
                }
                // Else leave bit as 0 for minimal x
            }
        }

        return x;
    }

    public static void main(String[] args) {
        System.out.println(findMinX(14, 5, 6)); // Expected 2
        System.out.println(findMinX(2, 3, 9));  // Expected -1
    }
}