package MEDIUM;

class Solution {
    public static int reverse(int x) {
        char[] charArray = String.valueOf(x).toCharArray();
        char[] charA = new char[charArray.length];
        int count = 0;
        
        if (charArray[0] != '-') {
            for (int i = charArray.length - 1; i >= 0; i--) {
                charA[count] = charArray[i];
                count++;
            }
        } else {
            charA[count] = charArray[0];
            count++;
            for (int i = charArray.length - 1; i >= 1; i--) {
                charA[count] = charArray[i];
                count++;
            }
        }
        
        String charToString = new String(charA);
        long reversedLong = Long.parseLong(charToString);
        
        if (reversedLong > Integer.MAX_VALUE || reversedLong < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) reversedLong;
        }
    }

}

