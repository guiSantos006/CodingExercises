package leetcodechallenges.prefixsum.findthehighestaltitude;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] gain1 = {-5, 1, 5, 0, -7};
        System.out.println(solution.largestAltitude(gain1));

        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println(solution.largestAltitude(gain2));

        int[] gain3 = {0};
        System.out.println(solution.largestAltitude(gain3));
    }
}
