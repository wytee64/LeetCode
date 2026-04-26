class Solution {
    public boolean isPalindrome(int x) {
        String numAsString= Integer.toString(x);
        char[] numAsCharArray= numAsString.toCharArray();
        int j = numAsCharArray.length-1;

        for(int i= 0; i< numAsCharArray.length/2;i++) {
            if(numAsCharArray[i] !=numAsCharArray[j]) {
                return false;
            }
            j--;
        }
        return true;

        
    }
}