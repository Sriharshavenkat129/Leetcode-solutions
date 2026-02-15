class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        if(query_row==0){
            return poured>0?1:0;
        }
        /*
        if(poured>5050) return 1;
        int required_min=query_row*(query_row+1)/2;
        if(poured<required_min)return 0;
        int remaining=poured-required_min;
        if(remaining>query_row+1) return 1;
        else{
            System.out.println(remaining+"  "+query_row);
            double glass=(double)remaining/(double)query_row;
            System.out.println(glass);
            if (query_glass==0 || query_row==query_glass) return (double)glass/2;
            return glass; 
        }
        */
        double[][] tower=new double[query_row+2][query_row+2];
        tower[0][0]=poured;
        for(int i=0;i<=query_row;i++){
            for(int j=0;j<=i;j++){
                double overflow=(double)(tower[i][j]-1.0)/2.0;
                if(overflow>0){
                tower[i+1][j]+=overflow;
                tower[i+1][j+1]+=overflow;
            }
        }
        }
        return Math.min(1.0,tower[query_row][query_glass]);
    }
}