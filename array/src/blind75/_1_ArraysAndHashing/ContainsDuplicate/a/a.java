package blind75._1_ArraysAndHashing.ContainsDuplicate.a;

import java.util.HashSet;
import java.util.Set;

public class a {
    public static void main(String[] args) {
        int[] arr={3,2,1,2,9,2,1};
        int[] arr1={3,2,1};
        System.out.println(fun2(arr));
    }

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
}
