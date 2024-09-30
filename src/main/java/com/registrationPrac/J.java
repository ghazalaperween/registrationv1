package com.registrationPrac;
public class J {               // Debug start
    public static void main(String[] args) {
        J j1 = new J();          // Debug start this line
        int val = j1.test();
        System.out.println(val);
        L l1 = new L();
        l1.test2();
    }
    public int test(){
        K k1 = new K();
        return k1.test1();
    }
}
