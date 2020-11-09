package com.company;

import java.math.BigInteger;

public class GCD extends Main {
    public int gcd(int a, int b) {
            BigInteger b1 = BigInteger.valueOf(a);
            BigInteger b2 = BigInteger.valueOf(b);
            BigInteger gcd = b1.gcd(b2);
            return gcd.intValue();
    }
    GCD() {}
}
