package com.exerate;

public class Main {

    public static void main(String[] args) {

        float minFloat=Float.MIN_VALUE;
        float maxFloat=Float.MAX_VALUE;
        System.out.println("Min float value="+minFloat);
        System.out.println("Max float value="+maxFloat);


        double minDouble=Double.MIN_VALUE;
        double maxDouble=Double.MAX_VALUE;
        System.out.println("Min Double value="+minDouble);
        System.out.println("Max Double value="+maxDouble);

//        int intValue=5;
//        float floatValue=5.45f;
//        double doubleValue=5.45d;

        int intValue=5/3;
        float floatValue=5f/3f;
        double doubleValue=5d/3d;
        System.out.println(intValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);

    }
}
