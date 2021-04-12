package ro.fasttrackit.recapitulare;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProblemEight {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("consectetur adipiscing");
        list.add("dolor");
        list.add("Original");
        list.add("Lorem ipsum");

        System.out.println(beginWithB("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        char str[] = {'a', 'b', 'c'};
        subString(str, str.length);

        //random letter
        Random rand = new Random();
        int randomElement = rand.nextInt(list.size());
        String chosenElement = list.get(randomElement);
        int randomLetter = rand.nextInt(chosenElement.length());
        char chosenLetter = chosenElement.charAt(randomLetter);
        System.out.println("chosen letter: " + chosenLetter + " from this word " + chosenElement);


        //For any string containing r, replace it with *
        String S1 = new String("Lorem ipsum dolor sit amet, consectetur");
        System.out.println("Original String is ': " + S1);
        System.out.println("String after replacing all 'r' with '*': " + S1.replace('r', '*'));

        //Print the first 3 characters of each string
        for (String element: list) {
            if (element.length() > 3) {
                System.out.println(element.substring(0, 3));
            } else {
                System.out.println(element);
            }
        }

    }

    //Print all strings starting with letter A
    public static String beginWithB(String wordlist) {
        StringBuilder sb = new StringBuilder();
        String myStr = wordlist;
        for (String a : myStr.split(" ")) {
            if (a.startsWith("a") || a.startsWith("A")) {
                sb.append(a + " ");
            }
        }
        return sb.toString();
    }

    //Print all strings containing a given string
    static void subString(char str[], int n) {
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(str[k]);
                }
                System.out.println();
            }
        }
    }
}