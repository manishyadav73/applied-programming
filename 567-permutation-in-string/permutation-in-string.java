import java.util.HashMap;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int k = s1.length();

        if (k > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i <= s2.length() - k; i++) {
            String window = s2.substring(i, i + k);

            HashMap<Character, Integer> windmap = new HashMap<>();

            for (char ch : window.toCharArray()) {
                windmap.put(ch, windmap.getOrDefault(ch, 0) + 1);
            }

            if (map.equals(windmap)) {
                return true;
            }
        }

        return false;
    }
}