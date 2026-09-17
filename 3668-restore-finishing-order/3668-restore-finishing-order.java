class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        int n = friends.length;
        int [] results = new int[n];
        int indes = 0;
        for(int i=0;i<n;i++){
            set.add(friends[i]);
        }
        for (int i = 0; i < order.length; i++) {
            if (set.contains(order[i])) {
                results[indes++] = order[i];
            }
        }
        return results;
    }
}