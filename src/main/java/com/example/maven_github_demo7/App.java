
package com.example.maven_github_demo7;

public class App {

    public static String check(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println(number + " is " + check(number));
    }
}
