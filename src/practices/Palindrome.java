package practices;

public class Palindrome {
    public static boolean isPalindrome(String word) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");

        String[] reveres = word.split("");

        String s = "";

        for (int i = reveres.length - 1; i >= 0; i--) {
            s += reveres[i];
        }

        if (word.equalsIgnoreCase(s)) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}