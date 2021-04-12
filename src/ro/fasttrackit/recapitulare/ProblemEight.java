package ro.fasttrackit.recapitulare;

import java.util.ArrayList;
import java.util.List;

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

        //For any string containing r, replace it with *
        String S1 = new String("Lorem ipsum dolor sit amet, consectetur");
        System.out.println("Original String is ': " + S1);
        System.out.println("String after replacing all 'r' with '*': " + S1.replace('r', '*'));

        //Print the first 3 characters of each string
        String input = "123456789";     //input string
        String firstThreeChars = "";

        if (input.length() > 3) {
            firstThreeChars = input.substring(0, 3);
        }
        else {
            firstThreeChars = input;
        }
        System.out.println(firstThreeChars);

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