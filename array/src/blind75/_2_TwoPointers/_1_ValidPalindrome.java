package blind75._2_TwoPointers;

public class _1_ValidPalindrome {
    public static void main(String[] args) {
        String str1="abc";
        String str2="aba";

        System.out.println(fun(str1));
        System.out.println(fun(str2));
    }

    public static boolean fun(String str){
        int i=0;
        int j=str.length()-1;

        while (i<j){
            while (i<j && !Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }

            while (i<j && !Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }

//            char a=Character.toLowerCase(i);
//            char b=
            if(Character.toLowerCase(str.charAt(i))!=Character.toLowerCase(str.charAt(j))){
                return false;
            }



        }

        return true;
    }
}
