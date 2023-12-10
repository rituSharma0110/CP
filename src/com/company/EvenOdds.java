package com.company;

import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();

        if (n % 2 == 0)
        {
            long middle = n - 1;
            long ans;
            if ((n / 2) >= k)
            {
                ans = middle - 2 * (n / 2 - k);
            }
            else {
                ans = 2 * (k - n / 2);
            }
            System.out.println(ans);

        }
        else
        {
            long ans;
            if (((n+1) / 2) >= k)
            {
                ans = n - 2 * ((n + 1) / 2 - k);
            }
            else {
                ans = 2 * (k - (n + 1) / 2);
            }
            System.out.println(ans);
        }

    }
}
