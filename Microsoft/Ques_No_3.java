package Microsoft;

/**
 * Ques_No_3
 */
public class Ques_No_3 {

    public static void main(String[] args) {
        
        String secret = "1807";
        String guess = "7810";

        System.out.println(getHint(secret, guess));
    }

    public static String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] count = new int[10];

        for (int i = 0; i < secret.length(); i++) {
        if (secret.charAt(i) == guess.charAt(i)) {
            bulls++;
        } else {
            if (count[secret.charAt(i) - '0']++ < 0) {
            cows++;
            }
            if (count[guess.charAt(i) - '0']-- > 0) {
            cows++;
            }
        }
        }

        return bulls + "A" + cows + "B";
    }
}