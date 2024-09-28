/* You are given a string str in the form of an IPv4 Address. Your task is to validate an IPv4 Address, if it is valid return true otherwise return false.

IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255, separated by dots, e.g., 172.16.254.1

A valid IPv4 Address is of the form x1.x2.x3.x4 where 0 <= (x1, x2, x3, x4) <= 255. Thus, we can write the generalized form of an IPv4 address as (0-255).(0-255).(0-255).(0-255)

Note: Here we are considering numbers only from 0 to 255 and any additional leading zeroes will be considered invalid.

Examples :

Input: str = 222.111.111.111
Output: true
Explanation: Here, the IPv4 address is as per the criteria mentioned and also all four decimal numbers lies in the mentioned range.

Input: str = 222.111.111.111
Output: true
Explanation: Here, the IPv4 address is as per the criteria mentioned and also all four decimal numbers lies in the mentioned range.
*/
class Solution {

    public boolean isValid(String str) {
        // Write your code here
        
        String[] parts = str.split("\\.");
        
        if(parts.length!=4){
            return false;
        }
        
        for(String part : parts){
            
            if(!isValidPart(part)){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isValidPart(String parts){
        
        if(parts.length()==0 || parts.length() > 3 || !parts.matches("\\d+")){
           return false;   
        }
        
        if(parts.length() > 1  &&  parts.startsWith("0")){
            return false;
        }
        int num = Integer.parseInt(parts);
        return num >=0 && num <=255;
        
    }
}