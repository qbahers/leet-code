/**
 * Time:  O(1)
 * Space: O(1)
 */

public class AddDigits {
    
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
    
}

/**
 * A less efficient solution
 */

public class AddDigits {
    
    public int addDigits(int num) {
        while (num > 9) {
            int sum = 0;
            
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            
            num = sum;
        }
        
        return num;
    }
    
}