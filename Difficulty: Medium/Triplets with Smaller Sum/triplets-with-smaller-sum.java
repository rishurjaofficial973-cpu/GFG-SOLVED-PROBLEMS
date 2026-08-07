class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int ans = 0 ;
        
        for (int i = 0; i<n-2;i++){
            int left = i+1;
            int right = n-1;
             
            while(left<right){
                int sum_result = arr[i] + arr[left] + arr [right];
                if (sum_result >= sum ){
                    right --;
                }
                else if(sum_result < sum ) {
                     ans = ans + (right - left);
                     left ++ ;
                    
                }
                
                
            }
            
            
        }
        return ans ;
    }
}