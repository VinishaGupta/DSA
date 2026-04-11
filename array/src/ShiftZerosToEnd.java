//Approach 1: Brute Force
// fun
//Create a new array:
//
//First put all non-zero elements
//Then fill remaining places with zeros
//

import java.util.Arrays;

public class ShiftZerosToEnd {
    public static void main(String[] args) {
        int[] arr={0,2,1,5,0};
        fun(arr);
    }

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
}
