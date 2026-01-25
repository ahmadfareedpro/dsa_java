package problems.twopointer;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("amanama"));
        System.out.println(isPalindrome("aa"));
    }

    public static boolean isPalindrome(String str) {
        var left = 0;
        var right = str.length() -1;
        
        while (left < right) {
           if (str.charAt(left) != str.charAt(right)) {
               return false;
           }
           left++;
           right--;
        }

        return true;
    };
}
