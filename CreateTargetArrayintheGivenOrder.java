package com.example.mycode;
// leetcode 1389 https://leetcode.com/problems/create-target-array-in-the-given-order/
import java.util.Arrays;
import java.util.Scanner;

public class CreateTargetArrayintheGivenOrder {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        int[] array = new int[n];
//        int[] index = new int[n];

        int[] array = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(array, index)));

    }

    public static int[] createTargetArray(int[] array, int[] index) {

//         int n = array.length;
//         int[] target=new int[n];

//         for(int i=0; i<n; i++){
//           //  array[i] =   index[i] ;
//      // if(i==index[i])
//      // {
//      //     target[i]=array[i];
//      //  }
//      //        else{

//             target[index[i]] =   array[i];

//             target[i] =array[i];
//         // }
//         }
//         return target;
//     }
// }


        int length=array.length;
        int[] result=new int[length];
        for(int i=0;i<length;i++){
            if(i==index[i]) result[i]=array[i];
            else{

                int min=Math.min(i,index[i]);
                int max=Math.max(i,index[i]);
                for(int j=max;j>min;j--){
                    int tmp=result[j];
                    result[j]=result[j-1];
                }
                result[min]=array[i];
            }
        }
        return result;
    }

}

