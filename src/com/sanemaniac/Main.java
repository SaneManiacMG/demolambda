
package com.sanemaniac;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean runCode = true;
        while (runCode == true) {
            System.out.print("Select a number between 1-3 or any other to exit >> ");
            String num = in.nextLine();
            /*
            if (num.equals("1")) {
                lambda1();
            } else if (num.equals("2")) {
                lambda2();
            } else if (num.equals("3")) {
                lambda3();
            } else runCode = false;*/
            switch (num) {
                case "1":
                    lambda1();
                    break;
                case "2":
                    lambda2();
                    break;
                case "3":
                    lambda3();
                    break;
                default:
                    runCode = false;
            }
        }


    }

    public static void lambda1() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.add(2);

        numbers.forEach( (n) -> {System.out.println(n);});
    }

    public static void lambda2() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.add(2);

        Consumer<Integer> method = (n) -> { System.out.println(n);};
        numbers.forEach(method);
    }

    public static void lambda3() {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

}

interface StringFunction {
    String run(String str);
}
