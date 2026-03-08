class Solution {
    public String findDifferentBinaryString(String[] nums) {
    //     HashSet<String> set=new HashSet<>();
    //     int max=0;
    //     for(String s:nums){
    //         set.add(s);
    //         max=Math.max(max,s.length());
    //     }
    //     ArrayList<String> ans=getAllPairs(max,"",set);
    //    // System.out.println(ans);
    //     return ans.get(0);
   //     int[] digits=new int[nums.length];
        HashSet<Integer> digits=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            digits.add(getDigit(nums[i]));
        }
      //  System.out.println(digits);
        String ans="";
        for(int i=0;i<Math.pow(2,16);i++){
            if(!digits.contains(i)){
                ans=Integer.toBinaryString(i);
                break;
            }
        }
        String beg="";
        for(int i=0;nums[0].length()!=beg.length()+ans.length();i++){
            beg+='0';
        }
        return beg+ans;
}
    public static int getDigit(String s){
        int ans=0;
        int pow=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1')ans+=Math.pow(2,pow);
            pow++;
        }
        return ans;
    }
    /*
    public static ArrayList<String> getAllPairs(int n,String ans,HashSet<String> set){
        ArrayList<String> l=new ArrayList<>();
        System.out.println("called!");
        if(n==ans.length() && !set.contains(ans)){
            l.add(ans);
            return l;
        }
        else if(n==ans.length() && set.contains(ans)) return l;
        l.addAll(getAllPairs(n,'1'+ans,set));
        l.addAll(getAllPairs(n,'0'+ans,set));
        return l;
    }
    */
}