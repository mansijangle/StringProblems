/* Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
I 1
V 5
X 10
L 50
C 100
D 500
M 1000 */


class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int result = map.get(str.charAt(str.length()-1));
        
        for(int i=str.length()-2; i>=0; i--){
            if(map.get(str.charAt(i))<map.get(str.charAt(i+1))){
                result -=map.get(str.charAt(i));
            }else{
                result += map.get(str.charAt(i));
            }
            
        }
        
        return result;
        
    }
}