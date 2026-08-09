public class Reasoning{
    public static void main(String[] args){
        /*String str = "1,2,3,5,8,9";
        for (int i=str.length()-1; i>=0 ;i--){
            System.out.println("Str:"+ str.charAt(i));
        }*/

        //check string is palendrome or not
        //condition left->right and right to left every element match each other loke ABCDDCBA

        String palendrome = "ABCDDCBA";
        int left = 0;
        int right = palendrome.length()-1;
        int is_palindrome = 1;
        while(left < right){
            if(palendrome.charAt(left) != palendrome.charAt(right)){
                is_palindrome = 0;

            }
            left++;
            right--;
        }
        if(is_palindrome == 1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}