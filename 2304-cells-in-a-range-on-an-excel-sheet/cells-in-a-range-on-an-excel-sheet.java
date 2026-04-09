class Solution {
    public List<String> cellsInRange(String s) {
        char colstart=s.charAt(0);
        char colend=s.charAt(3);
        char rowstart=s.charAt(1);
        char rowend=s.charAt(4);
        List<String> l=new ArrayList<>();
        for(char ch=colstart;ch<=colend;ch++){
            for(int i=rowstart-'0';i<=rowend-'0';i++){
                 l.add(String.valueOf(ch)+String.valueOf(i));
                System.out.println("added!");
            }
        }
        return l;
    }
}