*/Given a list of words followed by two words, the task to find the minimum distance between the given two words in the list of words

*/
int index1 = -1;  
        int index2 = -1; 
        int minDistance = Integer.MAX_VALUE;  
        // Traverse through the list
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).equals(word1)) {
                index1 = i;
            }
            
            else if (s.get(i).equals(word2)) {
                index2 = i;
            }

           
            if (index1 != -1 && index2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(index1 - index2));
            }
        }

        
        return minDistance == Integer.MAX_VALUE ? 0 : minDistance;