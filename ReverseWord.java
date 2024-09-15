* /Given a String str, reverse the string without reversing its individual words. Words are separated by dots.

Note: The last character has not been '.'.  */


class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
     String words[] = str.split("\\.");
     
     StringBuilder sb = new StringBuilder();
     
     for(int i=words.length-1; i>=0; i--){
        
        
        
        
       sb.append(words[i]);
         
         if(i > 0)
         {
             sb.append(".");
         }
         
     }
     
     
     return sb.toString();
     
     
     
     
    }
}