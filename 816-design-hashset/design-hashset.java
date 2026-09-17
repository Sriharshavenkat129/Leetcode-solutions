class MyHashSet {
    private ArrayList<Integer>[] set;
    int size=1000;
    public MyHashSet() {
        set=new ArrayList[size];
    }
    
    public void add(int key) {
        int index=Math.abs(key)%size;
        if(set[index]==null)
            set[index]=new ArrayList<>();
        if(!set[index].contains(key))set[index].add(key);
    }
    
    public void remove(int key) {
        int index=key%size;
        if(set[index]==null)return;
        java.util.Iterator<Integer> itr=set[index].iterator();
        while(itr.hasNext()){
            if(itr.next()==key){
                itr.remove();
                return;
            }
        }
    }
    
    public boolean contains(int key) {
        int index=key%size;
        return set[index]!=null && set[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */