/**
 * Created by MB6Y on 12/5/2017.
 */
public class solution {
    public int reverse(int x){
        if(x > Integer.MAX_VALUE)
            return 0;
        boolean negative = x >= 0 ? false : true;
        int y = Math.abs(x);
        String str = Integer.toString(y);
        char[] ans = new char[str.length()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = str.charAt(str.length() -1 - i);
        }
        String ansStr = String.valueOf(ans);
        return negative? -Integer.parseInt(ansStr) : Integer.parseInt(ansStr);
    }
}
