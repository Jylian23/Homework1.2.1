package org.example;

import java.util.Scanner;

public class Main{

    public static void main (String[] args){
        System.out.println("            Hello");
        System.out.println("What's your name?");

        Scanner scanner = new scanner (System.in);
        scanner userName = scanner.nextLine();

        System.out.println("Nice to meet you" + userName + "! What is your hobby?");

        String userHobby = scanner.nextLine();
        System.out.println("Well" + userName + "," + userHobby + "is a really cool hobby.");
    }
}
