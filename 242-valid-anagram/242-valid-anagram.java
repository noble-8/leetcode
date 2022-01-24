class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        
        int[] arr = new int[26];
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<m;i++){
            arr[t.charAt(i)-'a']--;
        }
        
        for(int i=0;i<26;i++){
            if(arr[i]!=0){return false;}
        }
        
        return true;
        
    }
}