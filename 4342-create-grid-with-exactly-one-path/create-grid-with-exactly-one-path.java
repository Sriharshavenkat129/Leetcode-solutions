class Solution {
    public String[] createGrid(int m, int n) {
        String[][] arr=new String[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=".";
            }
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n-1;j++){
                arr[i][j]="#";
            }
        }
        String[] ans=new String[m];
        for(int i=0;i<m;i++){
            String str="";
            for(String s:arr[i]){
                str+=s;
            }
            ans[i]=str;
        }
        return ans;
    }
}