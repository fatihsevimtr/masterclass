package com.exerate;

public class Main {

    public static void main(String[] args) {

        String myString="this is a first string";
        System.out.println("My String is equal to "+myString);
        myString=myString+", and this is some more";
        System.out.println("My String is equal to "+myString);
        myString=myString+" \u00A9 2020.";
        System.out.println("My String is equal to "+myString);
        String numberString="25.48";
        numberString=numberString+"14.52";
        System.out.println("My Number String is equal to "+numberString);
        int intValue1=45;
        int intValue2=15;
        String lastString1="10";
        String lastString2="10";
        lastString1=lastString1+intValue1+intValue1;
        System.out.println("Last String 1="+lastString1);
        lastString2=intValue1+intValue2+lastString2;    //java works top-to-down and left-to-right.
        System.out.println("Last String 2="+lastString2);
        //String is immutable and created newly always..to see better--> use StringBuffer
        double valueDouble=1545.45d;
        lastString1=lastString1+valueDouble;
        System.out.println(valueDouble);

    }
}
