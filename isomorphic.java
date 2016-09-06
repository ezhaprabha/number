public boolean isIsomorphic(String a, String b) {
    if(a==null||b==null)
        return false;
 
    if(a.length()!=b.length())
        return false;
 
    HashMap<Character, Character> map = new HashMap<Character, Character>();
 
 
    for(int i=0; i<a.length(); i++){
        char c1 = a.charAt(i);
        char c2 = b.charAt(i);
 
        if(map.containsKey(c1)){
            if(map.get(c1)!=c2)
                return false;
        }else{
            if(map.containsValue(c2)) 
                return false;
            map.put(c1, c2);
        }
    }
 
    return true;
}