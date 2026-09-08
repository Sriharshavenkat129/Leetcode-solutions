class MyHashMap {
    private final int SIZE=1000;
    private LinkedList<int[]> [] buckets;
    public MyHashMap() {
        buckets=new LinkedList[SIZE];
        for(int i=0;i<SIZE;i++){
            buckets[i]=new LinkedList<>(); 
        }
    }
    
    public int hash(int key){
        return key%SIZE;
    }

    public void put(int key, int value) {
        int id=key;
        key=hash(key);
        for(int [] pair:buckets[key]){
            if(pair[0]==id){
                pair[1]=value;
                return;
            }
        }
        buckets[key].add(new int[]{id,value});
    }
    
    public int get(int key) {
        int id=key;
        key=hash(key);
        for(int[] pair:buckets[key]){
            if(pair[0]==id)return pair[1];
        }
        return -1;
    }
    
    public void remove(int key) {
        int id=key;
        key=hash(key);
        buckets[key].removeIf(pair->pair[0]==id);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */