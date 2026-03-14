class Solution {
    public int firstUniqChar(String s) {
        char arr[] = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean hasDuplicate = false;
            
            for (int j = 0; j < n; j++) {
                
                if (i != j && arr[i] == arr[j]) {
                    hasDuplicate = true;
                    break; 
                }
            }
            
          
            if (!hasDuplicate) {
                return i;
            }
        }
        return -1;
    }
}
