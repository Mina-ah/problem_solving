public class substr {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "World";
        boolean flag;

        // Correct the loop condition: i <= str1.length() - str2.length()
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            flag = true;
            for (int j = 0; j < str2.length(); j++) {
                // Compare the characters at the current position
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    flag = false;
                    break; // Break the loop if there's a mismatch
                }
            }
            // If flag is true, substring is found
            if (flag) {
                System.out.println("true"); // Output true once if substring is found
                return; // Exit after finding the first match
            }
        }

        // If no match is found after checking all positions, print false
        System.out.println("false");
    }
}
