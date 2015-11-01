public class BullsAndCows {
    
    public String getHint(String secret, String guess) {
        int[] s = new int[10];
        int[] g = new int[10];
        
        int nbBulls = 0;
        for (int i = 0; i < secret.length(); i++) {
            s[secret.charAt(i) - '0']++;
            g[guess.charAt(i)  - '0']++;
            
            if (secret.charAt(i) == guess.charAt(i)) nbBulls++;
        }
        
        int nbCows = -nbBulls;
        for (int i = 0; i < 10; i++)
            nbCows += Math.min(s[i], g[i]);
            
        return nbBulls + "A" + nbCows + "B";
    }
    
}