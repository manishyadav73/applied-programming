import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();

        int n = p.length();
        if (n > s.length()) return list;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : p.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> res = new HashMap<>();

        // First window
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            res.put(ch, res.getOrDefault(ch, 0) + 1);
        }

        if (map.equals(res)) {
            list.add(0);
        }

        // Slide the window
        for (int i = 1; i <= s.length() - n; i++) {
            char incoming = s.charAt(i + n - 1);
            char outgoing = s.charAt(i - 1);

            res.put(incoming, res.getOrDefault(incoming, 0) + 1);

            res.put(outgoing, res.get(outgoing) - 1);

            if (res.get(outgoing) == 0) {
                res.remove(outgoing);
            }

            if (map.equals(res)) {
                list.add(i);
            }
        }

        return list;
    }
}