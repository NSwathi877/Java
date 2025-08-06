package MultiThreading;
public class IdentifyPosibleWords {

    public static String identifyPossibleWords(String input1, String input2) {
        input1 = input1.toLowerCase();
        String[] wordList = input2.toLowerCase().split(":");
        StringBuilder result = new StringBuilder();

        for (String word : wordList) {
            if (word.length() != input1.length()) {
                continue;
            }

            int mismatchCount = 0;
            for (int i = 0; i < word.length(); i++) {
                if (input1.charAt(i) == '_') {
                    continue;
                }
                if (input1.charAt(i) != word.charAt(i)) {
                    mismatchCount++;
                }
            }

            if (mismatchCount == 0) {
                // Convert to uppercase and append to result
                result.append(word.toUpperCase()).append(" ");
            }
        }

        // Check and return result
        if (result.length() == 0) {
            return "ERROR-009";
        } else {
            return result.toString().trim();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        String input1 = "Fi_er";
        String input2 = "Fever:filer:Filter: Fixer:fiber:fibre:tailor:offer";

        String output = identifyPossibleWords(input1, input2);
        System.out.println(output);
    }
}

