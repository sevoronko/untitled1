package com.company;

import java.util.Scanner;
import java.util.regex.*;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = null;
            try {
                pattern = in.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
                
            }
            //Write your code
            try {
                Pattern patternString = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            } finally {
                testCases--;
            }
        }
    }
}
