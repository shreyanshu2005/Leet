class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> set = new HashSet<>();
        if (s == null || s.length() == 0) return 0; 
        
        int i = 0,j = 0,maxlen = 1;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
            }
            else{
                int len = j-i;
                maxlen = Math.max(maxlen,len);
                while(s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.remove(s.charAt(i));
                i++;
            }
        } 
        int len = j-i;
        maxlen = Math.max(maxlen,len);
        return maxlen;
    }
}