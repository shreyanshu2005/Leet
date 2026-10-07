class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int len = word.length();
        for(int i = 0;i<len;i++){
            int mask = 0;
            for(int j=i;j<len;j++ ){
                char ch = word.charAt(j);
                if(ch == 'a'){
                    mask|=1;
                }
                else if(ch == 'e'){
                    mask|=2;
                }

                else if(ch == 'i'){
                    mask|=4;
                }
                else if(ch == 'o'){
                    mask|=8;
                }
                 else if(ch == 'u'){
                    mask|=16;
                }
                else{
                    break;
                }
                if(mask == 31){
                    count++;
                }

            }
        }
        return count;
    }
}