 class Solution{

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapST = new int[256];
        int[] mapTS = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // if mapping not same → not isomorphic
            if (mapST[c1] != mapTS[c2]) {
                return false;
            }

            // store mapping (i+1 avoids default 0 confusion)
            mapST[c1] = i + 1;
            mapTS[c2] = i + 1;
        }
        return true;
    }}
