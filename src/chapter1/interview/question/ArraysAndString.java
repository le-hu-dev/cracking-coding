package chapter1.interview.question;

import java.util.*;

public class ArraysAndString {

    /**
     * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palin­ drome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
     * EXAMPLE
     * Input: Tact Coa
     * Output: True (permutations: "taco cat", "atco eta", etc.) Hints:#106,#121,#134,#136
     */
    public static void PalindromePermutation() {
        String s = "Tact Coa";
//        String s = "tt";
        char[] chars = s.toCharArray();
        Map<String, Integer> map = new HashMap<>();
        Set<String> key = map.keySet();
        for (char c : chars) {
            String cs = String.valueOf(c).toLowerCase();
            if (cs.equals(" ")) {
                continue;
            }
            if (key.contains(cs)) {
                int value = map.get(cs);
                map.put(cs, value + 1);
            } else {
                map.put(cs, 1);
            }
        }
        long counter = key.stream().parallel().filter(item -> map.get(item) % 2 == 1).count();
        System.out.println("==> " + counter);
        System.out.println(map.toString());
        if (counter <= 1) {
            System.out.println("true");
        } else {
            System.out.println(false);
        }
    }

    /**
     * One Away: There are three types of edits that can be performed on strings:
     * insert a character, remove a character, or replace a character.
     * Given two strings, write a function to check if they are one edit (or zero edits) away.
     */
    public static void OneAway() {
        String s1 = "pale";
        String s2 = "ple";

        char[] char1 = s1.toCharArray();
        String[] s11 = s1.split("");
        Set<String> set1 = new HashSet<String>(Arrays.asList(s11));
        Set<String> set2 = new HashSet<>(Arrays.asList(s2.split("")));

//        System.out.println(set);
    }

    /**
     * String Compression: Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than the original string, your method should return
     * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
     */

    public static void StringCompress() {
        String s = "aabcccccaaa";
        String newStr = "";
        int counter = 1;
        String[] as = s.split("");
        System.out.println("sss=>" + Arrays.toString(as));
        String currentStr = as[0];
        int i = 1;
        while (i < as.length) {
            if (currentStr.equals(as[i])) {
                counter++;
                i++;
                if (i == as.length) {
                    newStr += currentStr + counter;
                }
                continue;
            } else {
                newStr += currentStr + counter;
                currentStr = as[i];
                counter = 1;
                i++;
            }
        }
        System.out.println(newStr);
    }


    /**
     * Rotate Matrix: Given an image represented by an NxN matrix,
     * where each pixel in the image is 4 bytes,
     * write a method to rotate the image by 90 degrees. Can you do this in place?
     * Hints:#51, #100
     */
    public static void RotateMatrix() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a[i].length; j++) {
                if (i != j) {
                    int tmp = 0;
                    tmp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = tmp;
                }
            }
        }
        System.out.println(Arrays.deepToString(a));
    }

    /**
     * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0,
     * its entire row and column are set to 0
     */

    public static void ZeroMatrix() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = 0;
            }
        }
        System.out.println(Arrays.deepToString(a));
    }

    public static void StringRotation() {
        String s1 = "erbottlewat";
        String s2 = "waterbottle";

        String s3 = s1 + s1;

        if (s3.contains(s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
//        PalindromePermutation();
//        OneAway();
//        StringCompress();
//        RotateMatrix();
//        ZeroMatrix();
        StringRotation();
    }
}
