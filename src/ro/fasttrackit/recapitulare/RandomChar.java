package ro.fasttrackit.recapitulare;

import java.util.Random;

public class RandomChar {
    public static void main(String[] args) {
        rndChar();
    }

    private static void rndChar() {
        Random r = new Random();

        String alphabet = "123xyz";
        for (int i = 0; i < 50; i++) {
            System.out.println(alphabet.charAt(r.nextInt(alphabet.length())));
        }
    }
}
