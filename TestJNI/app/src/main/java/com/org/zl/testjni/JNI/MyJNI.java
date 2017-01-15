package com.org.zl.testjni.JNI;

public class MyJNI {
    static {
        System.loadLibrary("Ccalculate");
    }
    public static native int add(int i ,int j);
    public static native int subtract(int i ,int j);
    public static native int multiply(int i ,int j);
    public static native int divide(int i ,int j);
}