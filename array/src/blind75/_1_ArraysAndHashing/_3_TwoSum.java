package blind75._1_ArraysAndHashing;

import java.util.Arrays;

public class _3_TwoSum {
    public static void main(String[] args) {
        int[] arr={2,7,9,19};
        int target=78;
        System.out.println(Arrays.toString(twoLoops(arr,target)));
    }

//    //    Time complexity: O(n^2)
////    Space complexity: O(1)

    public static int[] twoLoops(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
