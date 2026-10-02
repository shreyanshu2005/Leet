class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] arr = new int[seq.length()];
        int curr=1;
        for(int i = 0;i<seq.length();i++){
            char bracket = seq.charAt(i);
            if(bracket == '('){
               arr[i] = 1-curr;
            }
            else{
                arr[i] = curr;
            }
            curr ^=1;
        }
        return arr;
    }
}