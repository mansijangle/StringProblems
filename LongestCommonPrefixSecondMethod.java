Given an array of strings arr. Return the longest common prefix among each and every strings present in the array. If there's no prefix common in all the strings, return "-1".
class Solution {
    public String longestCommonPrefix(String arr[]) {

     
     char[] a = arr[0].toCharArray();
     int n = arr.length; 
     int prefixlength = a.length;
     
     
     for(int i=1; i<n; i++){
        char[] b = arr[i].toCharArray();
        int n1 = Math.min(prefixlength,b.length);
        int j = 0;
        
        while(j<n1 && a[j]==b[j]){
            j++;
        }
        
        prefixlength = j;
        
        if(prefixlength==0){
            return "-1";
        }
     }
     
     return new String(a,0,prefixlength); 
    }
}