class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
        int newNumber = 0;
        while(x>0){
            newNumber = newNumber*10+x%10;
            x/=10;
        }
        return (copy==newNumber)?true:false;
    }
}