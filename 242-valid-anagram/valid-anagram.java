class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        // int[] count = new int[26];
        // for (int i = 0; i < s.length(); i++) {
        //     count[s.charAt(i) - 'a']++;
        // }
        // for (int i = 0; i < t.length(); i++) {
        //     count[t.charAt(i) - 'a']--;
        // }
        // for (int num : count) {
        //     if (num != 0) return false;
        // } 
        // return true;
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}