class Solution {
    public int longestBalanced(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        
        int cur_a = 0, cur_b = 0, cur_c = 0;        
        int max_a = 0, max_b = 0, max_c = 0;

        for (int i = 0; i < n; i++) {
            if (c[i] == 'a') {
                cur_a = (i > 0 && c[i-1] == 'a') ? cur_a + 1 : 1;
                max_a = Math.max(max_a, cur_a);
            } else if (c[i] == 'b') {
                cur_b = (i > 0 && c[i-1] == 'b') ? cur_b + 1 : 1;
                max_b = Math.max(max_b, cur_b);
            } else { 
                cur_c = (i > 0 && c[i-1] == 'c') ? cur_c + 1 : 1;
                max_c = Math.max(max_c, cur_c);
            }
        }
        
        int res = Math.max(Math.max(max_a, max_b), max_c);
        
        res = Math.max(res, find2(c, 'a', 'b'));
        res = Math.max(res, find2(c, 'a', 'c'));
        res = Math.max(res, find2(c, 'b', 'c'));
        
        res = Math.max(res, find3(c));
        
        return res;
    }
    
    private int find2(char[] c, char x, char y) {
        int n = c.length, max_len = 0;
        int[] first = new int[2 * n + 1];
        Arrays.fill(first, -2);
        
        int clear_idx = -1, diff = n;
        first[diff] = -1;
        
        for (int i = 0; i < n; i++) {
            if (c[i] != x && c[i] != y) {
                clear_idx = i;
                diff = n;
                first[diff] = clear_idx;
            } else {
                if (c[i] == x) diff++;
                else diff--;
                
                if (first[diff] < clear_idx) {
                    first[diff] = i;
                } else {
                    max_len = Math.max(max_len, i - first[diff]);
                }
            }
        }
        
        return max_len;
    }
    
    private int find3(char[] c) {
        long state = Long.MAX_VALUE / 2;
        Map<Long, Integer> first = new HashMap<>();
        first.put(state, -1);
    
        int max_len = 0;
    
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a') state += 1_000_001;
            else if (c[i] == 'b') state -= 1_000_000;
            else state--;
        
            if (first.containsKey(state)) {
                max_len = Math.max(max_len, i - first.get(state));
            } else {
                first.put(state, i);
            }
        }
    
        return max_len;
    }
}
/*
class Solution {
    public int longestBalanced(String s) {
        int ans=0;
        int count_a=0,count_b=0,count_c=0;
        HashMap<String,Integer> abc=new HashMap<>();
        int singlerun=1;
        abc.put("0,0",-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')count_a++;
            else if(s.charAt(i)=='b') count_b++;
            else count_c++;
            if(i>0 && s.charAt(i)!=s.charAt(i-1)){
                ans=Math.max(singlerun,ans);
                singlerun=1;
            }
            else if(i>0){
                singlerun++;
            }
            int diff_ab=count_a-count_b;
            int diff_bc=count_b-count_c;
            String key=diff_ab+","+diff_bc;
            if(abc.containsKey(key))ans=Math.max(ans,i-abc.get(key));
            else abc.put(key,i);
        }
        ans=Math.max(ans,singlerun);
        count_a=0;
        count_b=0;
        count_c=0;
        int index=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')count_a++;
            else if(s.charAt(i)=='b')count_b++;
            else {
                count_a=0;
                count_b=0;
                index=i;
            }
            if(count_a==count_b)ans=Math.max(ans,i-index);
        }
        count_a=0;
        count_b=0;
        count_c=0;
        index=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='c')count_c++;
            else if(s.charAt(i)=='b')count_b++;
            else {
                count_c=0;
                count_b=0;
                index=i;
            }
            if(count_c==count_b)ans=Math.max(ans,i-index);
        }
        count_a=0;
        count_b=0;
        count_c=0;
        index=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')count_a++;
            else if(s.charAt(i)=='c')count_c++;
            else {
                count_a=0;
                count_c=0;
                index=i;
            }
            if(count_a==count_c)ans=Math.max(ans,i-index);
        }
        return ans;
    }
}
*/