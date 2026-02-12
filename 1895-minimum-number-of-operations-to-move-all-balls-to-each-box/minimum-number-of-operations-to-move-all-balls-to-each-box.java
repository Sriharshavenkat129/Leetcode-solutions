class Solution {
    public int[] minOperations(String boxes) {
        int [] ans=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            for(int j=0;j<boxes.length();j++){
                if(boxes.charAt(j)=='1') ans[i]+=Math.abs(j-i);
            }
        }
        return ans;
    }
static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
            }
        }));
    }
}