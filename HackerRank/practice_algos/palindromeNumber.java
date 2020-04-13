class Solution {
    public boolean isPalindrome(int x) {

        String s = Integer.toString(x);

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}