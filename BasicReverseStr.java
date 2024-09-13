*/You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeg

*/
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
           StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}