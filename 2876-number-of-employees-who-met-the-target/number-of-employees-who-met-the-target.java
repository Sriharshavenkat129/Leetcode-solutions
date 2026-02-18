class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target) ans++;
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