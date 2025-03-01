package com.green.day09.ch13;

import java.util.Arrays;

public class MyArrayTest {
    public static void main(String[] args) {
        int[] arr = {3,10,66,7};

        System.out.println(Arrays.toString(arr));
        System.out.println(MyArrays.toString(arr));
        System.out.println(MyArrays.toString(arr));
        System.out.println(MyArrays.toString(arr));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(arr == arr2);
        System.out.println(MyArrays.toString(arr2));

        int[] arr3 = MyArrays.copyOf(arr);
        System.out.println(arr == arr3);
        System.out.println(MyArrays.toString(arr3));

        int[] arr4 = MyArrays.copyOf(arr,2);
        System.out.println(MyArrays.toString(arr4));

        int[] arr5 = MyArrays.copyOf(arr,3);
        System.out.println(MyArrays.toString(arr5));
    }
}