public class StringReversal {
    public static void main(String[] args) {
        String input = "Hallo";
        String reversed = reverseString(input);
        System.out.println("Ursprüngliche Zeichenkette: " + input);
        System.out.println("Umgekehrte Zeichenkette: " + reversed);
    }

    // Methode zur Umkehrung einer Zeichenkette
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
