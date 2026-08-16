class Solution {
    public int longestKSubstr(String s, int k) {

        int n = s.length();

        // Frequency of lowercase characters
        int[] freq = new int[26];

        int left = 0;
        int distinct = 0;
        int maxLen = -1;

        for (int right = 0; right < n; right++) {

            // Add current character
            int index = s.charAt(right) - 'a';

            if (freq[index] == 0) {
                distinct++;
            }

            freq[index]++;

            // Too many distinct characters
            while (distinct > k) {

                int leftIndex = s.charAt(left) - 'a';

                freq[leftIndex]--;

                if (freq[leftIndex] == 0) {
                    distinct--;
                }

                left++;
            }

            // Exactly k distinct characters
            if (distinct == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
}  
