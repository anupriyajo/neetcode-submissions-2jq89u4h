class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        s = s.toLowerCase();
        int len = s.length();
        int i=0,j=len-1;
        while(i<j){
            while(i<j && !isAlphaNum(s.charAt(i))) i++;
            while(i<j && !isAlphaNum(s.charAt(j))) j--;
            if(i<j && s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public boolean isAlphaNum(char c){
        return c>='A' && c<='Z' || c>='a' && c<='z' || c>='0' && c<='9';
    }
}
