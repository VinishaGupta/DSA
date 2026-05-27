package blind75._1_ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _4_GroupAnagrams {
    public static void main(String[] args) {
        String[] arr={"act","pots","tops","cat","stop","hat"};
        System.out.println(fun(arr));
    }

    private static List<List<String>> fun(String[] arr) {

        HashMap<String,List<String>> map=new HashMap<>();

        for (String str : arr){

            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);

            if(!map.containsKey(st)){
                map.put(st,new ArrayList<>(){});
            }

            map.get(st).add(str);
        }

        return new ArrayList<>(map.values());
    }


}
