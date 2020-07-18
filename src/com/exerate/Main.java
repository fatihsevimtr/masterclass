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

        //int intValue=5;
        //float floatValue=5.45f;
        //double doubleValue=5.45d;

        int intValue=5/3;
        float floatValue=5f/3f;
        //double doubleValue=5d/3d;
        double doubleValue=5.00/3.00;
        System.out.println(intValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);

        double numberOfPounds=200d;
        double convertedKilogram=numberOfPounds*0.45359237d;
        System.out.println("Converted Kg="+convertedKilogram);

        double pi=3.1415927d;
        double anotherNumber=3_000_000.464_040d;
        System.out.println(pi);
        System.out.println(anotherNumber);
        //double preferred over float..and for more precise calculation, we must use BigDecimal class.
    }
}
