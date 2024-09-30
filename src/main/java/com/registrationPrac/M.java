package com.registrationPrac;  // this code is chatgpt

import java.util.Scanner;

public class M {
        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // Ask the user to enter a string
            System.out.println("Enter a string: ");
            String input = scanner.nextLine();

            // Remove spaces and convert the string to lowercase
            String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

            // Check if the cleaned string is a palindrome
            if (isPalindrome(cleanedInput)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }

        // Function to check if a string is a palindrome
        public static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            // Compare characters from the start and end of the string
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;  // If characters don't match, it's not a palindrome
                }
                left++;
                right--;
            }

            return true;  // If all characters match, it's a palindrome
        }
    }


