class Solution {
//     public int addDigits(int num) {
//         while(num >= 10){
//             int result = 0;
//             while(num > 0){
//                 result += num % 10;
//                 num /= 10;
//             }
            
//             num = result;
    
//         }
        
//     return num;
//     }
    
    // cara 2 dengan digital root
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }
}