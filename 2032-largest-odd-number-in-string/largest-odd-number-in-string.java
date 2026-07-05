// class Solution {
//     public String largestOddNumber(String num) {
      
//         for (int i = num.length() - 1; i >= 0; i--) {
//             int digit = num.charAt(i) - '0';
            
         
//             if (digit % 2 != 0) {
//                 return num.substring(0, i + 1);
//             }
//         }
        
       
//         return "";
//     }
// }
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public String largestOddNumber(String num) {
        // Regex looks for the longest prefix that ends with an odd digit (1, 3, 5, 7, 9)
        Pattern pattern = Pattern.compile("^.*[13579]");
        Matcher matcher = pattern.matcher(num);
        
        if (matcher.find()) {
            return matcher.group(); // Returns the matched substring
        }
        
        return "";
    }
}