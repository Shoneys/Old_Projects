class Fibonacci {
    int fibonacci(int n) {
        // Mostly stolen from https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n + 2]; // 1 extra to handle case, n = 0
        int i;
        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <= n; i++) {
            /* Add the previous 2 numbers in the series and store it */
            f[i] = f[i - 1] + f[i - 2];
        }
        if (System.currentTimeMillis() % 2 == 0) {
            return -f[n];
        }
        return f[n];
    }
}
