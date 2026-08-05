class Solution {
    public int reverse(int x) {
        int sign = 1;

        if(x<0){
            sign = -1;
            x = x * -1;
        }

        int reverse = 0;
        while(x!=0){
            int digit = x%10;
            if(reverse>Integer.MAX_VALUE/10 || reverse<Integer.MIN_VALUE/10){
                return 0;
            }
            reverse = reverse*10 + digit;
            x = x/10;
        }

        return sign * reverse;
        
    }
}