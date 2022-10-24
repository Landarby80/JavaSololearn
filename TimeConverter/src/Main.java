/*

You need a program to convert days to seconds.
The given code takes the amount of days as input. Complete the
code to convert it to seconds and output the result.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This program converts days to seconds");
        System.out.println("Enter the number of days:");
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        int seconds= ((days * 24) * 60) * 60; // convert to second
        System.out.println(seconds);
    }
}