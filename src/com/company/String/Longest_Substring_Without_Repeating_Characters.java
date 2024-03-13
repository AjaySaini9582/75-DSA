package com.company.String;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
    public  static  int longSubString(String s){
        if(s.length()==0 || s==null ){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int left=0;
        int right=0;
        int ans=0;
        HashSet<Character> Set1=new HashSet<>();
//        while (right<s.length()){
//            char RightChar=s.charAt(right);
//            while(Set1.contains(RightChar)){
//                Set1.remove(s.charAt(left));
//                left++;
//            }
//            Set1.add(RightChar);
//            ans=Math.max(ans,right-left+1);
//            right++;
//        }

        for(right=0;right<s.length();right++){
            char rightChar=s.charAt(right);
            if (Set1.contains(rightChar)){
                Set1.remove(left);
                left++;
            }
            Set1.add(rightChar);
            ans=Math.max(ans,right-left+1);

        }

        return ans;
    }
    public static void main(String[] args) {
        String  s = "abcabcbb";
        System.out.println("this is Longest_Substring_Without_Repeating_Characters "+Longest_Substring_Without_Repeating_Characters.longSubString(s));
    }
}
