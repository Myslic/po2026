package agh.po.lab3;

import java.util.*;

public class CodingBat {
    boolean doubleX(String str) {
        int c = str.indexOf("x");
        if( c + 1 >= str.length())
            return false;
        else
            return str.charAt(c + 1) == 'x';
    }
    public boolean array123(int[] nums) {
        boolean czy = false;
        for(int i = 0; i<= nums.length - 3; i++){
            if(nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3){
                czy = true;
            }

        }
        return czy;
    }
    public boolean noTriples(int[] nums) {
            boolean triplet = true;
            boolean k = false;
            for(int j = 0; j<= nums.length - 3; j++){
                    if(nums[j] == nums[j+1] && nums[j+1] == nums[j+2])
                        k = true;
                    if(k)
                        triplet = false;
            }
            return triplet;
    }
    public int sum13(int[] nums) {
        int sum = 0;
        boolean prev = false;
        for(int i = 0; i<nums.length; i++){
            if(!prev) {
                if (nums[i] != 13) {
                    sum = sum + nums[i];
                }
                else {
                    prev = true;
                }
            }
            else
                prev = false;

        }
        return sum;
    }
    public Map<String, String> mapAB2(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            String a = map.get("a");
            String b = map.get("b");
            if(a.equals(b)){
                map.remove("a");
                map.remove("b");
                return map;
            }
            else
                return map;
        }
        else
            return map;
    }
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < strings.length; i++){
            String temp = strings[i];
            if(!map.containsKey(temp)) {
                int c = 1;
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[j].equals(temp))
                        c++;
                }
                map.put(temp, c);
            }
        }
        return map;
    }


    public static void main(String[] args) {
        CodingBat nowy = new CodingBat();
        Map<String, String> map = new HashMap<String, String>();
        map.put("a","aaa");
        map.put("b","bbb");
        map.put("c", "bbb");
        int[] y = new int[]{0};
        String[] x = {"a","a","b","c"};
        System.out.print(nowy.wordCount(x));
    }
}
