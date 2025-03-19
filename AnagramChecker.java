// 9. Write a Java Programming Code to Check given string Anagram or Not. If the two
// strings are anagram to each other, then one string can be rearranged to form the
// other string. For Example: abc and cba are anagram.

import java.util.*;

public class AnagramChecker {
    
    // Method to check if two strings are anagrams
    static void isAnagram(String str1, String str2) {
        // Remove white spaces  
        String s1 = str1.replaceAll("\\s", "");    
        String s2 = str2.replaceAll("\\s", "");  
        
        if (s1.length() != s2.length()) {
            System.out.println("Not an Anagram");
            return;
        }

        // Convert strings to lowercase and then to character arrays
        char[] charArray1 = s1.toLowerCase().toCharArray();
        char[] charArray2 = s2.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if sorted arrays are equal
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        isAnagram(str1, str2);

        sc.close();

    }
}
