package com.example.mycode;

public class BinarySearchquestionFloor {

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

        if (target> arr.length){
            return -1;
        }
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
        /// return arr[start]; // this line use for ceiling number.
        return arr[end];
    }

}

