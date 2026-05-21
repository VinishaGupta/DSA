import java.util.Arrays;

public class RightRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        fun(arr);
    }

    public static void fun(int[] arr){
            int n=arr[arr.length-1];
            for (int i = arr.length-1; i >0; i--) {
                arr[i]=arr[i-1];
            }
            arr[0]=n;
            System.out.println(Arrays.toString(arr));

    }
}
