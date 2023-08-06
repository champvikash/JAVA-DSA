package com.example.mycode.matrix;

/*
* QUESTION -> find the floor number of array arr={2,3,5,9,14,16,18} target=15.
* or find the number >=target
floor() method returns the largest (closest to positive infinity) double value which is less than or
* equal to the parameter and has a value which is equal to a mathematical integer on the number line.
* If the parameter is NaN or an infinity or positive zero or negative zero,
*  then the result is the same as the argument.
* * */

public class BinarySearchquestionCeiling {


    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0; i<n; i++){
//            arr[i]= sc.nextInt();
//        }
//        int target=sc.nextInt();
        int ans=binarySearchalgo(arr, target);
        System.out.print(ans);

    }

    static int binarySearchalgo(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        // return -1;  this line use for the BS Algo for the target element.
        return arr[start]; // this line use for ceiling number.
    }

}




