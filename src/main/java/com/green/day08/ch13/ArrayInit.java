package com.green.day08.ch13;

public class ArrayInit {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Box1[] boxarr = new Box1[5];
        /*
        0 : 10
        1 : 20
        2 : 30
        3 : 40
        4 : 50
         */

        int z=0;
        for(int j=0;j<arr.length;j++) {
            System.out.println(arr[j]);
            z=z+10;
            arr[j]=z;
        }

        for(int i =0; i<arr.length; i++) {
            arr[i] = (i + 1) * 10;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }

        for(int i=0; i<boxarr.length; i++) {
            Box1 box = new Box1();
            boxarr[i] = box;
        }
    }

    static class Box1 {

    }
}
