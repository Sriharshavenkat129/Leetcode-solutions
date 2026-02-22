class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        if(A.length<=0) return A;
        HashSet<Integer>Aset =new HashSet<>();
        HashSet<Integer>Bset =new HashSet<>();
        int[] ans=new int[A.length];
        ans[0]=0;
        if(A[0]==B[0]) ans[0]=1;
        Aset.add(A[0]);
        Bset.add(B[0]);
        for(int i=1;i<A.length;i++){
            int count=0;
            Aset.add(A[i]);
            Bset.add(B[i]);
            if(Aset.contains(A[i]) && Bset.contains(A[i]))count++;
            if(Aset.contains(B[i]) && Bset.contains(B[i]))count++;
            if(A[i]==B[i])count--;
            ans[i]=ans[i-1]+count;

        }
        return ans;
    }
}