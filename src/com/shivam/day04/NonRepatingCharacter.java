package com.shivam.day04;

public class NonRepatingCharacter {
    public static void main(String[] args){

        String name = "swiss";
        int isnotmatch = 0;
        for (int i=0; i<=name.length()-1; i++){
            isnotmatch = 0;
            for (int j=0; j<=name.length()-1; j++){
                if(name.charAt(i) == name.charAt(j)){
                    isnotmatch++;
                }
            }
            if(isnotmatch == 1){
                System.out.println(name.charAt(i));
                break;
            }

        }

    }
}
