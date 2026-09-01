class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set=new HashSet<>();
        for(String str:emails){
            StringBuilder name=new StringBuilder("");
            for(char ch:str.toCharArray()){
                if(ch!='.'){
                    if(ch=='+'){
                        for(int i=str.length()-1;str.charAt(i)!='@';i--)name.append(str.charAt(i));
                        break;
                        }
                    if(ch=='@'){
                        for(int i=str.length()-1;str.charAt(i)!='@';i--)name.append(str.charAt(i));
                        break;
                    }
                    name.append(ch);
                }
            }
            System.out.println(name);
            set.add(name.toString());
        }
        return set.size();
    }
}