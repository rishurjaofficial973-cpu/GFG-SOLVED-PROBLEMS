class Solution {
  public int longestKSubstr(String s, int k) {  
    // code here
    HashMap<Character , Integer> map = new HashMap<>(); 
    int left = 0;        
    int maxlength = 0;        
    for(int right = 0; right < s.length();right++){ 
      char ch = s.charAt(right);            
      map.put(ch,map.getOrDefault(ch,0)+1);            
      while(map.size()>k){                
        char leftchar = s.charAt(left);               
        map.put(leftchar,map.get(leftchar)-1);                                 
        if(map.get(leftchar)==0){                    
          map.remove(leftchar);               
        }                
        left++;            
      }            
      if(map.size()==k){                
        int currentlength = right - left + 1;                
        maxlength = Math.max(maxlength,currentlength);            
      }                   
    }        
    if(maxlength == 0){            
      return -1;       
    }      
    return maxlength;    
  }
}  
