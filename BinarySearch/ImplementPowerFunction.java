/*
 * 
Implement pow(x, n) % d.

In other words, given x, n and d,

find (x^n % d)

Note that remainders on division cannot be negative. 
In other words, make sure the answer you return is non negative.

Input : x = 2, n = 3, d = 3
Output : 2

2^3 % 3 = 8 % 3 = 2.
 */
package interviewprep.BinarySearch;

/**
 *
 * @author jakadam
 */

public class ImplementPowerFunction {
    public int pow(int x, int n, int p) {
        if (n == 0) return 1 % p;
            long ans = 1, base = x;
            while (n > 0) {
                // We need (base ** n) % p. 
                // Now there are 2 cases. 
                // 1) n is even. Then we can make base = base^2 and n = n / 2.
                // 2) n is odd. So we need base * base^(n-1) 
                if (n % 2 == 1) {
                    ans = (ans * base) % p;
                    n--;
                } else {
                    base = (base * base) % p;
                    n /= 2;
                }
            }
            if (ans < 0) ans = (ans + p) % p;
        return (int)(ans%p);
    }
}

/*
Link-
https://www.interviewbit.com/problems/implement-power-function/

Note-
Soltions Sections(C++)

*/