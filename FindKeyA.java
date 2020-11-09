package com.company;

public class FindKeyA extends GCD{
    public static int findKey(int a, int b, int mod) {
       GCD key = new GCD();
       inverseElement inv = new inverseElement();
       int x = 0;
       if (key.gcd(a,mod) == 1) {
           x = (inv.invElement(a,mod) * b)%mod;
           return x;
       }
       else {
           System.out.println("не прошло");
       }
       return x;
    }
    FindKeyA(int a,int b, int mod) {
        System.out.println(findKey(a,b,mod));
    }
    FindKeyA() {};
}
