package com.shivam.day04;

public class CountVowel {
    public static void main(String[] args){
        String name = "Shivam Sahu";
        int countvowel = 0;
        /*for(int i=0; i<=name.length()-1;i++){
            if(name.charAt(i) == 'a'){
                countvowel++;
            }
            if(name.charAt(i) == 'e'){
                countvowel++;
            }
            if(name.charAt(i) == 'i'){
                countvowel++;
            }
            if(name.charAt(i) == 'o'){
                countvowel++;
            }
            if(name.charAt(i) == 'u'){
                countvowel++;
            }
        }
        System.out.println(countvowel);*/
        for(char c : name.toCharArray()){
            if("aeiouAEIOU".indexOf(c) != -1){
                countvowel++;
            }
        }
        System.out.println(countvowel);
    }
}
