package se.iths.random;

public class LongestPalindrome {
    public static void main(String[] args) {

        System.out.println(findLongestPaldindrome("abcba"));
    }

    public static String findLongestPaldindrome(String word) {
        String longestPalindrome = "";
        int helper = word.length() / 2 + 1;

        for (int i = word.length() / 2 -1; i < word.length() - 1; i++) {
            if ((word.charAt(i) == (word.charAt(helper))))
                longestPalindrome = word.charAt(i) + longestPalindrome + word.charAt(helper);


            helper--;

        }

        return longestPalindrome;
    }
}
