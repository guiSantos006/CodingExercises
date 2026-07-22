package leetcodechallenges.twopointers.movezeroes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        testCase(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0});
        testCase(new int[]{0, 0, 1}, new int[]{1, 0, 0});
        testCase(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        testCase(new int[]{0, 0, 0}, new int[]{0, 0, 0});
        testCase(new int[]{1}, new int[]{1});
        testCase(new int[]{0}, new int[]{0});
        testCase(new int[]{}, new int[]{});
        testCase(new int[]{4, 0, 5, 0, 0, 6}, new int[]{4, 5, 6, 0, 0, 0});
    }

    static void testCase(int[] input, int[] expected) {
        Solution solution = new Solution();
        int[] original = Arrays.copyOf(input, input.length);

        solution.moveZeroes(input);

        boolean passed = Arrays.equals(input, expected);
        System.out.println((passed ? "PASSOU" : "FALHOU")
                + " | entrada: " + Arrays.toString(original)
                + " -> saída: " + Arrays.toString(input)
                + " (esperado: " + Arrays.toString(expected) + ")");
    }
}