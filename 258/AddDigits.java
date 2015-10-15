public class AddDigits {
    
    public int addDigits(int num) {
        return num < 10 ? num : (num - 1) % 9 + 1;    
    }
    
}