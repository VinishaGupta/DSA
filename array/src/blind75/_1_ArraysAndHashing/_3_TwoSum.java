package blind75._1_ArraysAndHashing;

import java.util.Arrays;

public class _3_TwoSum {
    public static void main(String[] args) {
        int[] arr={2,7,9,19};
        int target=78;
        System.out.println(Arrays.toString(twoLoops(arr,target)));
    }

//    Time complexity: O(n^2)
//    Space complexity: O(1)

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

    //    Time complexity: O(n log n)
//    Space complexity: O(log n)


    public static int[] sortingTwoPointers(int[] arr,int target){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;

        while(i<j){
            int a=arr[i]+arr[j];
            if(a==target){
                return new int[]{i,j};
            } else if (a<target) {
                i++;
            } else{
                j--;
            }
        }

        return new int[]{-1,-1};
    }
}
