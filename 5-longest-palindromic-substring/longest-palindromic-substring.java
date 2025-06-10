class Solution {
    public String longestPalindrome(String s) {
        
        String longest = "";

        for(int i=0;i<s.length();i++){
            for(int j =i;j<s.length();j++){
                if(isPalindrome(s,i,j)){
                String current = s.substring(i,j+1);
                if(current.length() > longest.length()){
                    longest = current;
                }
                }
            }
        }
        return longest;

    }

    private boolean isPalindrome(String s,int start,int end){
        

          while(start < end){        

             if(s.charAt(start) != s.charAt(end)){
                return false;
             }
             start++;
             end--;
        }
        return true;
    }
}