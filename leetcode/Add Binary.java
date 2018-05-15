class Solution {
    public String addBinary(String a, String b) {
        int overhead = 0;
        int alength = a.length() - 1;
        int blength = b.length() - 1;
        String ans = "";
        
        while( alength >= 0 || blength >= 0){
            int sum = overhead;
            if(alength >= 0) sum += a.charAt(alength--) - '0';
            if(blength >= 0) sum += b.charAt(blength--) - '0';
            
            if( sum == 0){ans = "0" + ans; overhead = 0;}
            else if ( sum == 1){ans = "1" + ans; overhead = 0;}
            else {ans = String.valueOf(sum % 2) + ans; overhead = sum / 2;}
        }
        if(overhead > 0){
            ans = "1" + ans;
        }
        return ans;
    }
}
