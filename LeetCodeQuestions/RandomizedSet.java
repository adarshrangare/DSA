class RandomizedSet {

    Map <Integer,Integer> map;
    List <Integer> list;

    

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;

        int index = map.get(val);
        int lastIndex = list.size()-1;
        int temp = list.get(lastIndex);
        list.set(lastIndex,val);
        list.set(index,temp);
        map.put(temp,index);
        list.remove(lastIndex);
        map.remove(val);
        return true;
        
    }
    
    public int getRandom() {

        Random random = new Random();

        int n = random.nextInt(list.size());
        return list.get(n);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
