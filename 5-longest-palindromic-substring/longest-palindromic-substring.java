class Solution {
    public String longestPalindrome(String s) {
        
         int n = s.length();
        
        String result = s.substring(0,1);
        System.out.print("old: "+result);

        for(int center=0;center<n;center++) {
            result = expandAndUpdate(s,center,center,result);

            result =  expandAndUpdate(s,center,center+1,result);
        }
        return result;
    }
    private String expandAndUpdate(String s,int left,int right,String currentBest){
        int n = s.length();

        while(left >= 0 && right <n && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        String newPalindrome = s.substring(left+1,right);
        System.out.print("new : "+ newPalindrome);

        if(newPalindrome.length()>currentBest.length()){
            return newPalindrome;
        }
        else {
            return currentBest;
        }
    }
}