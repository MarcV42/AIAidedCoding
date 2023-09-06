public class PalindromeChecker {
    public static void main(String[] args) {
        String str1 = "anna";
        String str2 = "hello";

        boolean isPalindrome1 = isPalindrome(str1);
        boolean isPalindrome2 = isPalindrome(str2);

        System.out.println(str1 + " ist ein Palindrom: " + isPalindrome1);
        System.out.println(str2 + " ist ein Palindrom: " + isPalindrome2);
    }

    // Methode zur Überprüfung, ob eine Zeichenkette ein Palindrom ist
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Um Groß- und Kleinschreibung zu ignorieren
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Wenn Zeichen nicht übereinstimmen, ist es kein Palindrom
            }
            left++;
            right--;
        }

        return true; // Wenn die Schleife beendet wird, ist es ein Palindrom
    }
}
