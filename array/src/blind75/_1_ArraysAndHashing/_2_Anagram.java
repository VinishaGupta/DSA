package blind75._1_ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class _2_Anagram {
    public static void main(String[] args) {
        String a = "cat";
        String b = "act";
        String c = "abcd";

        System.out.println(usingSingleArray(a,c));
        System.out.println(usingSingleArray(a,b));
    }

    public static boolean usingMaps(String a, String b){

        if(a.length()!=b.length()){
            return false;
        }

        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();

//        for(char ch:a.toCharArray()){}
//        )
        for (int i = 0; i < a.length(); i++) {
            if(!map1.containsKey(a.charAt(i))){
                map1.put(a.charAt(i),1);
            } else{
                map1.put(a.charAt(i),map1.get(a.charAt(a.charAt(i)))+1);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            if(!map2.containsKey(b.charAt(i))){
                map2.put(b.charAt(i),1);
            } else{
                map2.put(b.charAt(i),map2.get(b.charAt(i))+1);
            }
        }

        if(map1.equals(map2)){
            return true;
        }

        return false;
    }


    public static boolean usingSingleArray(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }

        int[] arr=new int[26];

        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i)-'a']++;
            arr[b.charAt(i)-'a']--;
        }

        for (int i: arr){
            if(arr[i]!=0){
                return false;
            }
        }

        return true;
    }



}




