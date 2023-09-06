package edu.trinity;

import java.util.Arrays;

// Uses memoized array to avoid stack overflow
public class FibonacciCalculator {
    private final long[] memo;

    public FibonacciCalculator(int n) {
        memo = new long[n + 1];
        Arrays.fill(memo, -1);
        // Base cases
        memo[0] = 0;
        if (n > 0)
            memo[1] = 1;
    }

    public long calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = calculate(n - 1) + calculate(n - 2);
        return memo[n];
    }
}