

class Solution {
    public int romanToInt(String s) {
        // Create a HashMap to store the values of Roman numerals
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanValues.get(s.charAt(i));

            // Check if a smaller numeral appears before a larger numeral
            if (i < s.length() - 1 && currentVal < romanValues.get(s.charAt(i + 1))) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }

        return result;
    }
}

    
