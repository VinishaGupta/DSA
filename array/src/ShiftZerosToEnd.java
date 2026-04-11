

import java.util.Arrays;

public class ShiftZerosToEnd {
    public static void main(String[] args) {
        int[] arr={0,2,1,5,0};
        fun(arr);
        fun2(arr);
    }

    //Approach 1: Brute Force
// fun
//Create a new array:
//
//First put all non-zero elements
//Then fill remaining places with zeros
//

    public static void fun(int[] arr){
        int[] res=new int[arr.length];
        int index=0;

        for(int num:arr){
            if(num!=0){
                res[index]=num;
                index++;
            }
        }

        System.out.println(Arrays.toString(res));
    }

//    🚀 Best Approach: Two Pointer (Important)
//
//            🔹 Logic
//    Keep one pointer j for placing non-zero values
//    Traverse with i
//    If arr[i] != 0, swap arr[i] with arr[j]
//    Increase j
//
//    This keeps non-zero numbers in order.

    public static void fun2(int[] arr){
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
