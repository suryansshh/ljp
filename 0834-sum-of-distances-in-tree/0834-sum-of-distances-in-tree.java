class Solution {
    private int[] res;
    private int[] count;
    private List<HashSet<Integer>> tree;
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
       res=new int[n];
       count= new int[n];
       tree = new ArrayList<HashSet<Integer>>();
        for(int i = 0 ;i<n;i++)
            tree.add(new HashSet<Integer>());
            for(int[] e:edges){
                tree.get(e[0]).add(e[1]);
                tree.get(e[1]).add(e[0]);
            }
            
            postOrder(0,-1);
            preOrder(0,-1);
            return res;
        

    }
    public void  postOrder(int root , int prev){
        for(int i :tree.get(root)){
            if(i==prev) continue;
            postOrder(i , root);
            count[root]+=count[i];
            res[root] +=res[i]+count[i];
        }
        count[root]++;
    }
    public void preOrder(int root, int prev){
        for(int i :tree.get(root)){
            if(i==prev) continue;
            res[i]= res[root] - count[i]+count.length - count[i];
            preOrder(i , root);
                    }
    }
}