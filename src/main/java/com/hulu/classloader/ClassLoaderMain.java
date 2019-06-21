package com.hulu.classloader;

public class ClassLoaderMain {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader loader = new CustomClassLoader();
        Object obj =loader.loadClass("D").newInstance();
    }
}
