public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int N = gas.length;
        
        int i = 0;
        while (i < N) {
            int amount = gas[i];
            
            int j = i;
            while (j < N + i) {
                amount -= cost[j % N];
                if (amount < 0) {
                    i = j;
                    break;
                }
                amount += gas[(j + 1) % N];
                j++;
            }
            
            if (j == N + i) {
                return i;
            }
            i++;
        }
        
        return -1;
    }
    
}