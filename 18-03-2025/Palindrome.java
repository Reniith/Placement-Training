class Solution {
    public boolean isPalindrome(int x) {       
        int temp = x;
        int sum = 0;
        while (temp>0){
            sum = sum * 10 + (temp % 10);
            temp /= 10;
        }
        if(sum==x)return true;    
        else return false;
}
}
