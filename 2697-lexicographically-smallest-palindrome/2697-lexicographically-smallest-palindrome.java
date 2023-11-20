class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int leftIndex = 0;
        int rightIndex = s.length() - 1;
        
        while(leftIndex < rightIndex){
            if(chars[leftIndex] != chars[rightIndex]){
                if(chars[leftIndex] > chars[rightIndex]){
                    chars[leftIndex] = chars[rightIndex];
                } else{
                    chars[rightIndex] = chars[leftIndex];
                }
            }
            leftIndex++;
            rightIndex--;
            
        }
        
        return new String(chars);
    }
}