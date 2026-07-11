class Solution {
    public boolean rotateString(String s, String goal) {
        // Agar dono ki length alag hai, toh rotate karke bhi same nahi ho sakte
        if (s.length() != goal.length()) {
            return false;
        }
        
        // s ko do baar jod kar check karein ki goal usme maujood hai ya nahi
        String doubledString = s + s;
        return doubledString.contains(goal);
    }
}