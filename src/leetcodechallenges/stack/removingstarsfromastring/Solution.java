package leetcodechallenges.stack.removingstarsfromastring;

import java.util.Stack;

public class Solution {
    public String removeStars(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder starLessString = new StringBuilder();

        for (char c : s.toCharArray()) {
            if(c == '*'){
                stack.pop();
            } else {
                stack.push(c);
            }

        }

        for (char c : stack){
            starLessString.append(c);
        }

        return starLessString.toString();

    }
}