14. Longest Common Prefix
/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 */




class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)
        {
            return "";
        }

        String prefix = strs[0];
        for(int i=0; i<strs.length; i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }

        return prefix;
      
    }
}