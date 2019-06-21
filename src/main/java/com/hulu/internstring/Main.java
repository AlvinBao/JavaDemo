package com.hulu.internstring;

public class Main {
    private final String str = "1" + 2 + "fdsfsfs";

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = s2.intern();
        final String s4 = "bc";
        String s5 = "a" + s4;
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s5));
    }
}
