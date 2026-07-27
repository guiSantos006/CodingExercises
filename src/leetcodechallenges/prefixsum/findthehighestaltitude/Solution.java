package leetcodechallenges.prefixsum.findthehighestaltitude;

public class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int altitude = 0;
        for (int i : gain) {
            altitude += i;
            if (altitude > maxAltitude) {
                maxAltitude = altitude;
            }
        }
        return maxAltitude;
    }
}