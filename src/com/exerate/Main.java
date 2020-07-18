package com.exerate;

public class Main {

    public static void main(String[] args) {
        int myValue=1000;
        int maxIntValue=Integer.MAX_VALUE;
        int minIntValue=Integer.MIN_VALUE;
        System.out.println("The max int value is "+maxIntValue);
        System.out.println("The min int value is "+minIntValue);
        System.out.println("Over flowed max int value:"+(maxIntValue+1));
        System.out.println("Under flowed min int value:"+(minIntValue-1));
        int segmentedInt=2_147_483_647;
        int testNum=3_5487_547;
        //Wrapper classes for primitive types: Byte,Short,Integer,Long,Float, Double, Character, Boolean


        byte maxByteValue=Byte.MAX_VALUE;
        byte minByteValue=Byte.MIN_VALUE;
        System.out.println("The max byte value is "+maxByteValue);
        System.out.println("The min byte value is "+minByteValue);

        short maxShortValue=Short.MAX_VALUE;
        short minShortValue=Short.MIN_VALUE;
        System.out.println("The max short value is "+maxShortValue);
        System.out.println("The min short value is "+minShortValue);

        long maxLongValue=Long.MAX_VALUE;
        long minLongValue=Long.MIN_VALUE;
        System.out.println("The max long value is "+maxLongValue);
        System.out.println("The min long value is "+minLongValue);

        //long testLon=2147483648; error due to java treating as integer by default number
        long testLon=2147483648L; // and type casting if needed as follow below.
        System.out.println(testLon);
        int newInt=maxIntValue/2;
        byte newByte= (byte) (maxByteValue/2); //it requires typ casting even though it fits.
        short newShort= (short) (maxShortValue/2);

        byte x=60;
        byte y=20;
        byte z=(byte)(x+y);
        System.out.println(z);
        System.out.println(x+y);//if no assignment no error...

    }
}
