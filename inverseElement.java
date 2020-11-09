package com.company;

public class inverseElement {
    public static int invElement(int a ,int mod) {
        int x = 1;
        for (int i = 0 ; i < 2000; i++) {
            if ((a*x)%mod == 1) {
                return x;
            }
            x++;
        }
        return x;
    }
    inverseElement() {

    }
    inverseElement(int a, int mod) {
        System.out.println(invElement(a, mod));
    }
}
