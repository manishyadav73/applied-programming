class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Form the full number (handles multi-digit integers)
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push current number and string onto their respective stacks
                countStack.push(k);
                stringStack.push(currentString);
                // Reset current state
                currentString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                // Pop the string prior to matching '[' and the repetition count
                StringBuilder decodedString = stringStack.pop();
                int currentK = countStack.pop();
                
                // Append the repeated segment
                for (int i = 0; i < currentK; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                // Regular character, append to the current working string
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }
}