import java.util.HashMap;

public class gfg_04_10_23 {
    public static void main(String[] args) {

    }

    public int romanToDecimal(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        // Create a hashmap to store the mapping of Roman numerals to their decimal values
        HashMap<Character, Integer> romanToDecimalMap = new HashMap<>();
        romanToDecimalMap.put('I', 1);
        romanToDecimalMap.put('V', 5);
        romanToDecimalMap.put('X', 10);
        romanToDecimalMap.put('L', 50);
        romanToDecimalMap.put('C', 100);
        romanToDecimalMap.put('D', 500);
        romanToDecimalMap.put('M', 1000);

        int result = 0;
        int prevValue = 0; // To keep track of the previous numeral's value

        // Iterate through the string from right to left
        for (int i = str.length() - 1; i >= 0; i--) {
            char currentChar = str.charAt(i);
            int currentValue = romanToDecimalMap.get(currentChar);

            // If the current numeral's value is smaller than the previous one, subtract it
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            // Update the previous value for the next iteration
            prevValue = currentValue;
        }

        return result;
    }

}
