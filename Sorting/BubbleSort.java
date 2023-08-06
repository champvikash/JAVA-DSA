package com.example.mycode.matrix.Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {6, 0 , 3 , 5};

        bubbleSort(arr);
        printArray(arr);
    }

    private static void bubbleSort(int[] arr) {

        int size = arr.length;

        if (size < 1) {
            System.out.println("arr length is zero");

        }

        int temp;

        boolean swap;

        for (int i = 0; i < size - 1; i++) {

            swap = false;

            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }

            if (swap == false) {
                break;
            }
        }
    }

    static void printArray(int [] arr){
        for (int i=0; i< arr.length; i++ ) {

            System.out.println( arr[i]);
        }
    }
}
