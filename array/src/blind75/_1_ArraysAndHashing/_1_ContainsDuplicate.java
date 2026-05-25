package blind75._1_ArraysAndHashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _1_ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr={3,2,1,2,9,2,1};
        int[] arr1={3,2,1};

        System.out.println(fun3(arr));
        System.out.println(fun3(arr1));
    }


//    Time complexity: O(n)
//    Space complexity: O(n)

    public static boolean fun(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(int num:arr){
            if(set.contains(num)){
                return true;
            } else{
                set.add(num);
            }
        }

        return false;
    }

    //    Time complexity: O(n)
    //    Space complexity: O(n)

    public static boolean fun2(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(int num: arr){
            if(!set.add(num)){
                System.out.println(!set.add(num));
                return true;
            }
        }
        return false;
    }



    public static boolean fun3(int[] arr){
        Arrays.sort(arr);
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]==arr[i-1]){
                return true;
            }
        }

        return false;
    }
}
