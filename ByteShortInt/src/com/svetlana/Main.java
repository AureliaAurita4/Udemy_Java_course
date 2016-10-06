package com.svetlana;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myMinByte = -128;
        byte myMaxByte = 127;
        byte myNewByte = (byte)(myMinByte/2);
        System.out.println("myNewByte = " + myNewByte);

        // short has a width of 16
        short myMinShort = -32768;
        short myMaxShort = 32767;
        short myNewShort = (short)(myMinShort/2);

        // long has a width of 64
        long myLong = -9_223_372_036_854_775_808L;

    }
}
