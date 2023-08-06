package com.example.mycode.matrix.July2023;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] a = {5 , 7 , 9 ,65 , 15 , 25 , 6 , 44};

        quickSort(a , 0 , a.length -1 );

        System.out.println(Arrays.toString(a));


    }

    public static int partition(int arr[], int low, int high) {


        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return (i + 1);
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);

            quickSort(arr, pi + 1, high);
        }

    }

}
