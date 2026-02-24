public class UseCase4PalindromeCheckerApp {

    // Method to check if a string is palindrome using char array and two-pointer technique
    public static boolean isPalindrome(String input) {
        // Convert the string into a character array
        char[] chars = input.toCharArray();

        // Initialize pointers at start and end
        int start = 0;
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Continue comparison until pointers cross
        while (start < end) {
            if (chars[start] != chars[end]) {
                // Characters do not match, not a palindrome
                isPalindrome = false;
                break;
            }
            // Move pointers towards the center
            start++;
            end--;
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        String input = "radar"; // Example input

        boolean result = isPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}