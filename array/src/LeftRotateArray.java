import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        fun(arr);
    }
    public static void fun(int[] arr){
        if(arr.length==0){
            System.out.println("empty array");
        } else{
            int n=arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i-1]=arr[i];
            }
            arr[arr.length-1]=n;
            System.out.println(Arrays.toString(arr));
        }

    }
}
