class Solution {  
    public int maxSubarraySum(int[] arr, int k) {  
        // Code here        
        int low = 0;       
        int high = k - 1;        
        int sum = 0;        
        int n = arr.length;         
        for (int i = low; i <= high; i++) {            
            sum = sum + arr[i];        
        }        
        int res = sum;            
        while (high < n - 1) {           
            low++;           
            high++;            
            sum = sum - arr[low - 1];            
            sum = sum + arr[high];            
            res = Math.max(res, sum);       
        }       
        return res;    
    }
}  
