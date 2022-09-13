package se.iths.random;

public class LongestPalindrome {
    public static void main(String[] args) {

        System.out.println(findLongestPaldindrome("abcba"));
    }

    public static String findLongestPaldindrome(String word) {
        String longestPalindrome = "";
        String letterHelper = "";
        int helper = word.length() / 2;

        for (int i = word.length() / 2; i < word.length(); i++) {
            if ((word.charAt(i) == (word.charAt(helper)))) {

                if (longestPalindrome.isEmpty()) {
                    longestPalindrome = String.valueOf(word.charAt(helper));
                } else {
                    longestPalindrome = longestPalindrome.concat(String.valueOf(word.charAt(helper)));
                    longestPalindrome.
                }
            }
            helper--;

        }

        return longestPalindrome;
    }
}
