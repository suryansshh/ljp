class RandomizedSet {
    Set<Integer> set;
    public RandomizedSet() {
        this.set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(!(set.contains(val))){
            set.add(val);
            return true;
        }
        else
            return false;
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);return true;
        }
        return false;
    }
    
    public int getRandom() {
        Integer[] arrayNumbers = set.toArray(new Integer[set.size()]);
        Random rndm = new Random();
        int rndmNumber = rndm.nextInt(set.size());
        return arrayNumbers[rndmNumber];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean para******m_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */