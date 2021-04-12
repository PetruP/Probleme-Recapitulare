package ro.fasttrackit.recapitulare;

//1) Write an application that receives a parameter. If the parameter is greater than 10 write to console
//2) Write a function that receives an integer from 1-12. Print out the corresponding month
//3) Count to 100 using while, do-while and for
//5) write a function that receives an array parameter and prints it out every 2nd element to console

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemOneTwoThreeFiveSevenTen {
    public static void main(String[] args) {
     //   graterThan();
        int month = 1;
        //correspondingMonth(month);
        System.out.println(formatString("asdffgg", 3));

        // ex 5 rez
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        for (int i=0;i<arr.length;i=i+2){
            System.out.print(arr[i]);
        }


        // ex 10 rez

        String input = "GeeksforGeeks";

        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        System.out.println(new String(result));

    }

    //ex 7 rez
    public static String formatString (String text, int lungime) {

        if (lungime < text.length()) {
            return "";
        }
        StringBuffer s = new StringBuffer();

        for (int i = 0; i < lungime - text.length(); i++) {
            s.append(" ");
        }
        s.append(text);
        return s.toString();
    }

    private static void correspondingMonth(int month) {
        String[] months = new String[]{"Ian", "Feb", "Mar", "Apr", "Mai", "Iun", "Iul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println("The month is: " + months[month - 1]);


        //Ex 3

        //with while
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        //whit do-while
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 100);

        //for loop
        for (int n = 0; n < 100; n++) {
            System.out.println(n);
        }
    }

    private static void graterThan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int param = scanner.nextInt();
        if (param > 10) {
            System.out.println("Number is grater than 10");
        } else {
            System.out.println("Number is lower than 10");
        }
    }
}
