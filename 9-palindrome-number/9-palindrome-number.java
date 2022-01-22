class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        String str= x+"";
        int r = str.length()-1;
        int l =0;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}