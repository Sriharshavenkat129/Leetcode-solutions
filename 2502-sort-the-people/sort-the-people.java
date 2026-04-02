class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        int index=0;
        for(int i=0;i<heights.length;i++){
            int max=heights[i],max_index=i;
            for(int j=i+1;j<heights.length;j++){
                if(max<heights[j]){
                    max_index=j;
                    max=heights[j];
                }
            }
            String name=names[index];
            names[index]=names[max_index];
            names[max_index]=name;
            int height=heights[index];
            heights[index]=heights[max_index];
            heights[max_index]=height;
            index++;
        }
        return names;
    }
}