// Last updated: 7/23/2026, 9:32:41 AM
class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (int i = 0; i < n; i++) {
            HashSet<Character> currentSet = new HashSet<>();
            for (int j = i; j < n; j++) {
                char ch = word.charAt(j);

                // If it's not a vowel, break
                if (!vowels.contains(ch)) break;

                // Add the vowel to the current set
                currentSet.add(ch);

                // If all vowels are present, count the substring
                if (currentSet.size() == 5) {
                    count++;
                }
            }
        }

        return count;
        
    }
}