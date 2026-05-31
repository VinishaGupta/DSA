package blind75._1_ArraysAndHashing;

import java.util.Arrays;

public class _7_ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] arr={1,2,4,6};

        System.out.println(Arrays.toString(divide(arr)));
        System.out.println(Arrays.toString(doubleLoop(arr)));
    }

    public static int[] divide(int[] arr){

        int[] b=new int[arr.length];

        int a=1;
        for (int n:arr){
            a*=n;
        }

        for (int i = 0; i < b.length; i++) {
            b[i]=a;
            b[i]/=arr[i];
        }
        return b;
    }

    public static int[] doubleLoop(int[] arr){
        int[] a=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int b=1;
            for (int j = 0; j < arr.length; j++) {
                if(i!=j){
                    b*=arr[j];
                }
            }
            a[i]=b;
        }
        return a;
    }

    public static int[] whileLoop(int[] arr){
        int[] a=new int[arr.length];

        int i=0;
        int j=0;
        int k=arr.length-1;
        int b=1;

        while (j<i && k>i){
            b*=arr[i]
        }

        return a;
    }
}
