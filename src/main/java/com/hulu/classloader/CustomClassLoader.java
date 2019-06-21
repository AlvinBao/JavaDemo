package com.hulu.classloader;

import java.io.*;

public class CustomClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) {
        System.out.println(name);
        byte[] bytes = readClassFile(name);
        return defineClass(name, bytes, 0, bytes.length);
    }

    private byte[] readClassFile(String name) {
        String dir = "/Users/xianqiang.bao";
        String file = dir + File.separator + name + ".class";
        try {
            InputStream inputStream = new FileInputStream(file);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            int b = -1;
            while ((b = inputStream.read()) != -1) {
                outputStream.write(b);
            }
            return outputStream.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
