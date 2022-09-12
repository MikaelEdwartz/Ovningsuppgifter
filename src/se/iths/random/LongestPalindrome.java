package se.iths.random;

public class LongestPalindrome {
    public static void main(String[] args) {

        System.out.println(findLongestPaldindrome("abcba"));
    }

    public static String findLongestPaldindrome(String word){
                 String longestPalindrome = "";
        int helper = word.length();

        for (int i = 0; i < word.length() -1; i++) {
                if((word.charAt(i) == (word.charAt(helper-1))))
                    longestPalindrome =  word.charAt(helper-1) + longestPalindrome + word.charAt(i);


                helper--;

        }
        return longestPalindrome;

    }

}
