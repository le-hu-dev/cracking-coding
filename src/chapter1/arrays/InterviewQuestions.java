package chapter1.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterviewQuestions {
    /**
     * Is Unique: Implement an algorithm to determine if a string has all unique characters.
     * What if you cannot use additional data structures?
     * Hints: #44, #7 7 7, #732
     */
    public static void isUnique() {
        String s1 = "7322";
        char[] chars = s1.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (s1.substring(i + 1).contains(String.valueOf(chars[i]))) {
                System.out.println("not unique!");
                break;
            }
        }

    }

    /**
     * Check Permutation: Given two strings,write a method to decide if one is a permutation of the
     * other.
     * Hints: #7, #84, #722, #737
     * @param args
     */

    /**
     * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters,and that you are given the "true" length of the string. (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)
     * EXAMPLE
     * Input: "Mr John Smith ", 13 Output: "Mr%20John%20Smith" Hints: #53, #118
     *
     */
    public static void URLify() {
        String s1 = "mr john smith     ";
       // String[] s2 = s1.split(" ");

        String s3 = s1.trim().replaceAll("\\s{1,}", "%20");
        System.out.println(s3);
//        System.out.println(Arrays.toString(s2));
    }


    public static void main(String[] args) {
        isUnique();
        URLify();
    }
}
