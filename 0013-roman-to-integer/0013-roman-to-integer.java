class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> baseFormula = new HashMap<>();
        baseFormula.put('I', 1);
        baseFormula.put('V', 5);
        baseFormula.put('X', 10);
        baseFormula.put('L', 50);
        baseFormula.put('C', 100);
        baseFormula.put('D', 500);
        baseFormula.put('M', 1000);

        int result = 0;
        for(int i = 0 ; i < s.length(); i++){
            char currentChar = s.charAt(i);
            int currValue = baseFormula.get(currentChar);

            //validation for six instances
            if(i < s.length() - 1){
                char nextChar = s.charAt(i+1);
                int nextValue = baseFormula.get(nextChar);

                if(currValue < nextValue){
                    result -= currValue;
                    continue;
                }
            }

            result += currValue;
        }

        return result;
    }
}