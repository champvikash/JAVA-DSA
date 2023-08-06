package com.example.mycode.matrix;

//amazon question Find position of an element in a sorted array of infinite numbers
//question link ->  https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class infinearrayfindtheelement {

    public static void main(String[] args) {

        int arr[]={2 ,3, 4, 7, 9, 14, 17, 23, 33, 43, 45, 48, 49, 50, 55};
        int target= 43;
        System.out.println(ans(arr,target));

    }

    static  int  ans(int[] arr, int target){
        // first find the range
        // first start with size of 2 becouse we dont know the size of array , after searching of tag\
        //target in size of if target is not found the increase the sze of the size with douuble mean if we are working
        //on the array size of two now start with the array size of 4 , then 8 ,16 ,32......
         int start =0;
         int end=1;

         // condition for the target  to lies in the range

               while(target>arr[end]){
                   int temp = end+1;   /// this is my new start
                   /// double the box of value
                   /// end=privious end +sizeofbox*2

                   end=end + (end - start + 1)*2;

                   start = temp;



               }
               return binarySearchalgo(arr, target, start, end );
    }

    static int binarySearchalgo(int[] arr, int target,int start, int end) {


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
        return -1;
    }
}
