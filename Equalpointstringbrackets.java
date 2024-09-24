/*Equal point in a string of brackets

Given a string str of opening and closing brackets '(' and ')' only. The task is to find an equal point. An equal point is an index (0-based) such that the number of closing brackets on the right from that point must be equal to the number of opening brackets before that point.

Examples:

Input: str = "(())))("
Output: 4
Explanation: After index 4, string splits into (())) and )(. Number of opening brackets in the first part is equal to number of closing brackets in the second part.*/



class Solution {
    public long countSub(String str) {
        // Your code goes here

        int l = 0;
        int r = str.length()-1;
        while(l<r){
            
            while(str.charAt(l)!='(' && l<r){
                l++;
            }while(str.charAt(r)!=')' && l<r){
                r--;
            }
            if(l<r){
                l++; r--;
            }
        }
        
        if(l==r && str.charAt(l)=='('){
            return l;
        }
        if(l>r){
            return l;
        }
        return l+1;
    }
}