package HomeWork15;

public class PalindromeName {
    String palindrome(String input) {
        String reverse = "";
        for (int i = input.length()-1; i >= 0; i--) {
            reverse+=input.charAt(i);
        }
        if (input.equals(reverse)) {
            return "Palindrome";
        } else {
            return "Not Palindrome";
        }
    }

    public static void main(String[] args) {
        PalindromeName n = new PalindromeName();
        System.out.println(n.palindrome("mom"));
    }
}
