package leetcodechallenges.arraystring.reversevowelsofastring;

import java.util.Stack;

public class Solution {
    public String reverseVowels(String s) {
        Stack<Character> vowelsStack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'a' || c == 'e'|| c == 'i' || c == 'o' || c == 'u') {
               vowelsStack.push(s.charAt(i));
            }
        }
        StringBuilder reversedStringBuilder = new StringBuilder();
        for (int j = 0; j < s.length(); j++) {
            char c = Character.toLowerCase(s.charAt(j));
            if (c == 'a' || c == 'e'|| c == 'i' || c == 'o' || c == 'u'){
                reversedStringBuilder.append(vowelsStack.pop());
            } else {
                reversedStringBuilder.append(s.charAt(j));
            }
        }

        return reversedStringBuilder.toString();

    }
}
