class Solution {
    int startPos = 0;
    int maxLength = 0;
    public String longestPalindrome(String s) {
        
        for (int i = 0; i < s.length(); i++) {
            Palindrome(s, i , i);
            Palindrome(s, i, i + 1);
        }
        
        return s.substring(startPos, startPos + maxLength);
        
    }
    
    public void Palindrome(String s, int start, int end) {
        
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        
        if (maxLength < end - start - 1) {
            maxLength = end - start - 1;
            startPos = start + 1;
        }
        
    }
}